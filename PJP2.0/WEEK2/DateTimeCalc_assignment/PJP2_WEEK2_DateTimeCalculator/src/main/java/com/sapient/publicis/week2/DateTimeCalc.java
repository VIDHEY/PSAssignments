package com.sapient.publicis.week2;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.Scanner;

public class DateTimeCalc {
	private static ResourceBundle labels;
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	public static void process() throws ParseException {
		Scanner sc = new Scanner(System.in);
		labels = DisplayChoices.labels;
		
		int ch = sc.nextInt(); 
		
		switch (ch) {
		case 1: {
			System.out.println(labels.getString("ipDate1"));
			String date1 = sc.next();
			System.out.println(labels.getString("ipDate2"));
			String date2 = sc.next();
			break;
		}
		case 2: {
			System.out.println(labels.getString("ipDate1"));
			String date1 = sc.next();
			System.out.println(labels.getString("ipDate2"));
			String date2 = sc.next();
			DateOperations.subtractDates(date1, date2, formatter);
			break;
		}
		case 3: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumDays"));
			int number_of_days = sc.nextInt();
			DateOperations.addDays(date, number_of_days, formatter);
			break;
		}
		case 4: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumWeeks"));
			int number_of_weeks = sc.nextInt();
			DateOperations.addWeeks(date, number_of_weeks, formatter);
			break;
		}
		case 5: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumMonths"));
			int number_of_months = sc.nextInt();
			DateOperations.addMonths(date, number_of_months, formatter);
			break;
		}
		case 6: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumDays"));
			int number_of_days = sc.nextInt();
			DateOperations.subtractDays(date, number_of_days, formatter);
			break;
		}
		case 7: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumWeeks"));
			int number_of_weeks = sc.nextInt();
			DateOperations.subtractWeeks(date, number_of_weeks, formatter);
			break;
		}
		case 8: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumMonths"));
			int number_of_months = sc.nextInt();
			DateOperations.subtractMonths(date, number_of_months, formatter);
			break;
		}
		case 9: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			DateOperations.getDayofDate(date, formatter);
			break;
		}
		case 10: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			DateOperations.getWeekNumber(date, formatter);
			break;
		}
		case 11: {
			NaturalLangDateCalc.DateCalc();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
	}
}
