package com.sapient.publicis.week2;

import java.io.IOException;
import java.util.Scanner;

public class AutoDateTimeCalcRunner {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Operations Input File path :- "); 	// E:\\Dev_coding_folder\\operationsDateCalc.csv
		String ipFilePath = sc.nextLine();
		
		System.out.println("Num of Operations to generate :-");
		int numOfOpe = sc.nextInt();
		
		//generate automatic operations input 
		RandomDateTimeOperations.generate(numOfOpe, ipFilePath);
		
		System.out.println("***************************************");
		System.out.println("Result");
		System.out.println("***************************************");
		
		// perform Calculations from the file
		AutoDateTimeCalc.startCalc(ipFilePath);
		
	}
}
