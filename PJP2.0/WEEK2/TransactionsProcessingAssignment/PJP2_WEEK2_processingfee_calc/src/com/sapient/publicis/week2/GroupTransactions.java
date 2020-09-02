//package com.sapient.publicis.week2;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class GroupTransactions {
//	public static List<Transaction> group(List<Transaction> transactions) {
//		
//		List<Transaction> groupedTransactions = new ArrayList<Transaction>();
//		
//		var grpTransactionData = transactions.stream()
//				.collect(Collectors.groupingBy(Transaction::getClient_id, Collectors.groupingBy(Transaction::getTr_type,
//						Collectors.groupingBy(Transaction::getDate, Collectors.groupingBy(Transaction::getPriority)))));
//
//		for (var grpKey1 : grpTransactionData.keySet()) {
//			Map<String, Map<String, Map<Boolean, List<Transaction>>>> m2 = grpTransactionData.get(grpKey1);
//			for (var grpKey2 : m2.keySet()) {
//				Map<String, Map<Boolean, List<Transaction>>> m3 = m2.get(grpKey2);
//				for (var grpKey3 : m3.keySet()) {
//					Map<Boolean, List<Transaction>> m4 = m3.get(grpKey3);
//					for (var grpKey4 : m4.keySet()) {
//						var grpOutput = m4.get(grpKey4);
//						groupedTransactions.addAll(grpOutput);
//					}
//				}
//			}
//		}
//
//		return groupedTransactions;
//	}
//}
