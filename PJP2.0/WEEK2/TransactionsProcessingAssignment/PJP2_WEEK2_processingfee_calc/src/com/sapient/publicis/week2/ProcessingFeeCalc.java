package com.sapient.publicis.week2;

import java.util.List;
import java.util.Scanner;

public class ProcessingFeeCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Write Input File path : "); 	// E:\\Dev_coding_folder\\transactions.csv
		String ipFilePath = sc.nextLine();

		System.out.println("Write Output File path : ");	 // E:\\Dev_coding_folder\\transFees.csv
		String opFilePath = sc.nextLine();

		List<Transaction> transactions = ReadCSV.mapCSV(ipFilePath);
		transactions = ProcessTransactions.process(transactions);

		List<Transaction> groupedTransactions = GroupTransactions.group(transactions);
		WriteToCSV.write(groupedTransactions, opFilePath);
	}
}
