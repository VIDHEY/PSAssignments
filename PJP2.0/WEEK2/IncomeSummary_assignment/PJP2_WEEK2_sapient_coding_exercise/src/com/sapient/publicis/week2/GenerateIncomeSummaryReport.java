package com.sapient.publicis.week2;
import java.util.List;
import java.util.Scanner;

public class GenerateIncomeSummaryReport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write Input File path : ");
		String ipFilePath = sc.nextLine();
		
		System.out.println("Write Output File path : ");
		String opFilePath = sc.nextLine();
		
		//String incomeDataFile = "E:\\Dev_coding_folder\\incomeData.csv";
		
		List<IncomeData> inputIncomeData = ReadCSV.mapCSV(ipFilePath);
		List<SummaryObj> summary = ProcessIncomeData.process(inputIncomeData);
		
		WriteToCSV.write(summary, opFilePath);
		
		System.out.println(summary);
	}

}
