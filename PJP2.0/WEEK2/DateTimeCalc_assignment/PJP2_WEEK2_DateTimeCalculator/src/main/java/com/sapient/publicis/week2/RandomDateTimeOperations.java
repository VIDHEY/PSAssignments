package com.sapient.publicis.week2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDateTimeOperations {
	private static int min_ope_choice = 1, max_ope_choice = 10;
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	private static long start_time = LocalDate.parse("20-01-2002", formatter).toEpochDay();
	private static long end_time = LocalDate.parse("20-01-2020", formatter).toEpochDay();

	private static final String SEPARATOR = ",";

	// method to generate operations inputs
	public static void generate(int numOfOpe, String fileName) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));

		StringBuffer line = new StringBuffer();
		line.append("Operation" + SEPARATOR + "Date1" + SEPARATOR + "Date2" + SEPARATOR
				+ "numOfDays/numOfWeeks/numOfMonths");
		bw.write(line.toString());
		bw.newLine();

		long randomEpochDay;

		for (int ope = 0; ope < numOfOpe; ope++) {
			line = new StringBuffer();
			int ope_choice = new Random().nextInt(max_ope_choice - min_ope_choice + 1) + min_ope_choice;

			if (ope_choice == 1 || ope_choice == 2) {
				randomEpochDay = ThreadLocalRandom.current().longs(start_time, end_time).findAny().getAsLong();
				LocalDate randomDate1 = LocalDate.ofEpochDay(randomEpochDay);
				randomEpochDay = ThreadLocalRandom.current().longs(start_time, end_time).findAny().getAsLong();
				LocalDate randomDate2 = LocalDate.ofEpochDay(randomEpochDay);

				line.append(ope_choice);
				line.append(SEPARATOR);
				line.append(randomDate1);
				line.append(SEPARATOR);
				line.append(randomDate2);
				line.append(SEPARATOR);
				line.append("");
				bw.write(line.toString());
				bw.newLine();

			}

			else if (ope_choice == 9 || ope_choice == 10) {
				randomEpochDay = ThreadLocalRandom.current().longs(start_time, end_time).findAny().getAsLong();
				LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);

				line.append(ope_choice);
				line.append(SEPARATOR);
				line.append(randomDate);
				line.append(SEPARATOR);
				line.append("");
				line.append(SEPARATOR);
				line.append("");
				bw.write(line.toString());
				bw.newLine();

			} else {
				randomEpochDay = ThreadLocalRandom.current().longs(start_time, end_time).findAny().getAsLong();
				LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);
				int numInput = new Random().nextInt(30) + 1;

				line.append(ope_choice);
				line.append(SEPARATOR);
				line.append(randomDate);
				line.append(SEPARATOR);
				line.append("");
				line.append(SEPARATOR);
				line.append(numInput);
				bw.write(line.toString());
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}
}
