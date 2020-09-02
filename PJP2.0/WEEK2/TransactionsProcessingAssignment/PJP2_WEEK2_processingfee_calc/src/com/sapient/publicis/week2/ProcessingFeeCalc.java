package com.sapient.publicis.week2;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProcessingFeeCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Write Input File path : "); 	// E:\\Dev_coding_folder\\input_file_ProcessingFee_Calc.csv
		String ipFilePath = sc.nextLine();

		System.out.println("Write Output File path : ");	 // E:\\Dev_coding_folder\\out.csv
		String opFilePath = sc.nextLine();

		List<Transaction> transactions = ReadCSV.mapCSV(ipFilePath);
		transactions = ProcessTransactions.process(transactions);

		Collections.sort(transactions);
		WriteToCSV.write(transactions, opFilePath);
	}
}
