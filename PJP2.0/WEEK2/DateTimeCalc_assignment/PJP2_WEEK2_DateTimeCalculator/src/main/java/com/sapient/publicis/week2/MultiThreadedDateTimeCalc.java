package com.sapient.publicis.week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class mainCalc extends Thread {
	String row;
	DateTimeFormatter formatter;

	mainCalc(String row, DateTimeFormatter formatter) {
		super();
		this.row = row;
		this.formatter = formatter;
	}

	public void run() {
		try {
			String[] data = row.split(",");
			String date1, date2;
			int numDays, numWeeks, numMonths;
			int operation = Integer.parseInt(data[0]);

			switch (operation) {
			case 1:
				date1 = data[1];
				date2 = data[2];
				System.out.println(date1 + "  " + date2);
				break;
			case 2:
				date1 = data[1];
				date2 = data[2];
				DateOperations.subtractDates(date1, date2, formatter);
				break;
			case 3:
				date1 = data[1];
				numDays = Integer.parseInt(data[3]);
				DateOperations.addDays(date1, numDays, formatter);
				break;
			case 4:
				date1 = data[1];
				numWeeks = Integer.parseInt(data[3]);
				DateOperations.addWeeks(date1, numWeeks, formatter);
				break;
			case 5:
				date1 = data[1];
				numMonths = Integer.parseInt(data[3]);
				DateOperations.addMonths(date1, numMonths, formatter);
				break;
			case 6:
				date1 = data[1];
				numDays = Integer.parseInt(data[3]);
				DateOperations.subtractDays(date1, numDays, formatter);
				break;
			case 7:
				date1 = data[1];
				numWeeks = Integer.parseInt(data[3]);
				DateOperations.subtractWeeks(date1, numWeeks, formatter);
				break;
			case 8:
				date1 = data[1];
				numMonths = Integer.parseInt(data[3]);
				DateOperations.subtractMonths(date1, numMonths, formatter);
				break;
			case 9:
				date1 = data[1];
				DateOperations.getDayofDate(date1, formatter);
				break;
			case 10:
				date1 = data[1];
				DateOperations.getWeekNumber(date1, formatter);
				break;
			}
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

public class MultiThreadedDateTimeCalc{
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public static void main(String[] args) throws IOException, InterruptedException{
		BufferedReader csvReader = new BufferedReader(new FileReader("E:\\Dev_coding_folder\\operationsDateCalc.csv"));
		String row;
		csvReader.readLine();
		long startTime = System.currentTimeMillis();
		ExecutorService pool = Executors.newFixedThreadPool(15);
		
		while ((row = csvReader.readLine()) != null) {
				pool.execute(new mainCalc(row,formatter));
			}
		pool.shutdown();
		pool.awaitTermination(1000, TimeUnit.SECONDS);
		csvReader.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("\nTotal Time(ms):- " + (endTime - startTime));
		}
	}
