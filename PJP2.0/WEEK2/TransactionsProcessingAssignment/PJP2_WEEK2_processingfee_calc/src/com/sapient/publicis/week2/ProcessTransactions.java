package com.sapient.publicis.week2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ProcessTransactions {

	public static List<Transaction> process(List<Transaction> transactions) {

		for (Transaction tr : transactions) {
			calcProcessingFee(tr);
		}
		calcIntraDayTransFees(transactions);
		return transactions;
	}

	private static void calcProcessingFee(Transaction tr) {
		if (tr.getPriority() == true)
			tr.setProcessing_fee(500);
		else if (tr.getTr_type().equalsIgnoreCase("Sell") || tr.getTr_type().equalsIgnoreCase("Withdraw"))
			tr.setProcessing_fee(100);
		else
			tr.setProcessing_fee(50);
	}

	private static void calcIntraDayTransFees(List<Transaction> transactions) {
		HashSet<Integer> intraDayTransIds = findIntraDayTrans(transactions);

		for (Transaction trans : transactions) {
			if (intraDayTransIds.contains(trans.getTr_id())) {
				trans.setProcessing_fee(trans.getProcessing_fee() + 10);
				intraDayTransIds.remove(trans.getTr_id());
			}
		}

	}

	private static HashSet<Integer> findIntraDayTrans(List<Transaction> transactions) {
		HashSet<Integer> buySellTransIds = new HashSet<Integer>();

		Map<String, Integer> buySellTrans = new HashMap<String, Integer>();

		for (Transaction tr : transactions) {
			String key = String.valueOf(tr.getClient_id()) + "_" + String.valueOf(tr.getSecurity_id()) + "_"
					+ String.valueOf(tr.getDate());

			if (tr.getTr_type().contains("Buy")) {
				String findKey = key + "_Sell";

				if (buySellTrans.containsKey(findKey)) {
					int sellTransId = buySellTrans.get(findKey);
					int buyTransId = tr.getTr_id();

					buySellTransIds.add(sellTransId);
					buySellTransIds.add(buyTransId);
					buySellTrans.remove(findKey);
				} else {
					key += "_Buy";
					buySellTrans.put(key, tr.getTr_id());
				}
			} else if (tr.getTr_type().contains("Sell")) {
				String findKey = key + "_Buy";

				if (buySellTrans.containsKey(findKey)) {
					int buyTransId = buySellTrans.get(findKey);
					int sellTransId = tr.getTr_id();

					buySellTransIds.add(buyTransId);
					buySellTransIds.add(sellTransId);
					buySellTrans.remove(findKey);
				} else {
					key += "_Sell";
					buySellTrans.put(key, tr.getTr_id());
				}
			}
		}
		return buySellTransIds;
	}
}
