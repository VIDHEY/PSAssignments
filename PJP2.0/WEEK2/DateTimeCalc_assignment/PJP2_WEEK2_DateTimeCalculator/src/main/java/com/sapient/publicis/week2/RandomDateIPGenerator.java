package com.sapient.publicis.week2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDateIPGenerator {
	static int min_operation = 1, max_operation = 10;
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	static LocalDate startDate = LocalDate.parse("20-01-2002", formatter);
	static LocalDate endDate = LocalDate.parse("20-01-2020", formatter);
	static long start = startDate.toEpochDay();
	static long end = endDate.toEpochDay();
	private static final String SEPARATOR = ",";

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("E:\\Dev_coding_folder\\operationsDateCalc.csv"), "UTF-8"));
		StringBuffer line = new StringBuffer();
		line.append("Operation" + SEPARATOR + "Date1" + SEPARATOR + "Date2" + SEPARATOR
				+ "numOfDays/numOfWeeks/numOfMonths");
		bw.write(line.toString());
		bw.newLine();

		long randomEpochDay;
		long startTime = System.currentTimeMillis();

		for (int ope = 0; ope < 100000; ope++) {
			line = new StringBuffer();
			int operation = new Random().nextInt(max_operation - min_operation + 1) + min_operation;

			if (operation == 1 || operation == 2) {
				randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
				LocalDate randomDate1 = LocalDate.ofEpochDay(randomEpochDay);
				randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
				LocalDate randomDate2 = LocalDate.ofEpochDay(randomEpochDay);

				line.append(operation);
				line.append(SEPARATOR);
				line.append(randomDate1);
				line.append(SEPARATOR);
				line.append(randomDate2);
				line.append(SEPARATOR);
				line.append("");
				bw.write(line.toString());
				bw.newLine();

				System.out.println(
						"Operation :- " + operation + ", " + "Date1 :- " + randomDate1 + ", Date2:- " + randomDate2);
			}

			else if (operation == 9 || operation == 10) {
				randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
				LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);

				line.append(operation);
				line.append(SEPARATOR);
				line.append(randomDate);
				line.append(SEPARATOR);
				line.append("");
				line.append(SEPARATOR);
				line.append("");
				bw.write(line.toString());
				bw.newLine();

				System.out.println("Operation :- " + operation + ", " + "Date :- " + randomDate);
			} else {
				randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
				LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);
				int numOfDays = new Random().nextInt(30) + 1;

				line.append(operation);
				line.append(SEPARATOR);
				line.append(randomDate);
				line.append(SEPARATOR);
				line.append("");
				line.append(SEPARATOR);
				line.append(numOfDays);
				bw.write(line.toString());
				bw.newLine();

				System.out.println(
						"Operation :- " + operation + ", " + "Date :- " + randomDate + ", NumOfDays :- " + numOfDays);
			}
		}
		bw.flush();
		bw.close();

		long endTime = System.currentTimeMillis();
		System.out.println("Total Time(ms):- " + (endTime - startTime));

	}

}
