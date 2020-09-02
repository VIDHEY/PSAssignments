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
			tr.setProcessing_fee(500.0);
		else if (tr.getTr_type().equalsIgnoreCase("Sell") || tr.getTr_type().equalsIgnoreCase("Withdraw"))
			tr.setProcessing_fee(100.0);
		else
			tr.setProcessing_fee(50.0);
	}

	private static void calcIntraDayTransFees(List<Transaction> transactions) {
		HashSet<String> intraDayTransIds = findIntraDayTrans(transactions);
		for (Transaction trans : transactions) {
			if (intraDayTransIds.contains(trans.getTr_id())) {
				trans.setProcessing_fee(trans.getProcessing_fee() + 10);
				intraDayTransIds.remove(trans.getTr_id());
			}
		}

	}

	private static HashSet<String> findIntraDayTrans(List<Transaction> transactions) {
		HashSet<String> buySellTransIds = new HashSet<String>();

		Map<String, String> buySellTrans = new HashMap<String, String>();

		for (Transaction tr : transactions) {
			String key = "";
			
			if (tr.getTr_type().equalsIgnoreCase("buy")) {
				key = tr.getClient_id() + "_" + tr.getSecurity_id() + "_"
						+ String.valueOf(tr.getDate());
				String findKey = key + "_Sell";

				if (buySellTrans.containsKey(findKey)) {
					String sellTransId = buySellTrans.get(findKey);
					String buyTransId = tr.getTr_id();

					buySellTransIds.add(sellTransId);
					buySellTransIds.add(buyTransId);
					buySellTrans.remove(findKey);

					System.out.println("Buy Id:- " + buyTransId);
					System.out.println("Sell Id:- " + sellTransId);
				} else {
					key += "_Buy";
					buySellTrans.put(key, tr.getTr_id());
				}
			} else if (tr.getTr_type().equalsIgnoreCase("sell")) {
				
				key = tr.getClient_id() + "_" + tr.getSecurity_id() + "_"
						+ String.valueOf(tr.getDate());
				String findKey = key + "_Buy";

				if (buySellTrans.containsKey(findKey)) {
					String buyTransId = buySellTrans.get(findKey);
					String sellTransId = tr.getTr_id();

					buySellTransIds.add(buyTransId);
					buySellTransIds.add(sellTransId);
					buySellTrans.remove(findKey);

					System.out.println("Buy Id:- " + buyTransId);
					System.out.println("Sell Id:- " + sellTransId);
				} else {
					key += "_Sell";
					buySellTrans.put(key, tr.getTr_id());
				}
			}
		}
		return buySellTransIds;
	}
}
