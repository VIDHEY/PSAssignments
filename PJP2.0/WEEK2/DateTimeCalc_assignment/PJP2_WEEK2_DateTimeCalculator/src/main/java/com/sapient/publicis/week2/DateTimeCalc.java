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
		SessionObj obj = null;
		
		labels = DisplayChoices.labels;
		
		int ch = sc.nextInt(); 
		
		switch (ch) {
		case 1: {
			System.out.println(labels.getString("ipDate1"));
			String date1 = sc.next();
			System.out.println(labels.getString("ipDate2"));
			String date2 = sc.next();
			
			obj = new SessionObj("Add 2 Dates",new String[] {date1,date2});
			break;
		}
		case 2: {
			System.out.println(labels.getString("ipDate1"));
			String date1 = sc.next();
			System.out.println(labels.getString("ipDate2"));
			String date2 = sc.next();
			
			obj = new SessionObj("Subtract 2 Dates",new String[] {date1,date2});
			DateOperations.subtractDates(date1, date2, formatter);
			break;
		}
		case 3: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumDays"));
			int number_of_days = sc.nextInt();
			
			obj = new SessionObj("Add n Days to a Date",new String[] {date, String.valueOf(number_of_days)});
			DateOperations.addDays(date, number_of_days, formatter);
			break;
		}
		case 4: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumWeeks"));
			int number_of_weeks = sc.nextInt();
			
			obj = new SessionObj("Add n weeks to a Date",new String[] {date, String.valueOf(number_of_weeks)});
			DateOperations.addWeeks(date, number_of_weeks, formatter);
			break;
		}
		case 5: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumMonths"));
			int number_of_months = sc.nextInt();
			
			obj = new SessionObj("Add n months to a Date",new String[] {date, String.valueOf(number_of_months)});
			DateOperations.addMonths(date, number_of_months, formatter);
			break;
		}
		case 6: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumDays"));
			int number_of_days = sc.nextInt();
			
			obj = new SessionObj("Subtract n Days from a Date",new String[] {date, String.valueOf(number_of_days)});
			DateOperations.subtractDays(date, number_of_days, formatter);
			break;
		}
		case 7: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumWeeks"));
			int number_of_weeks = sc.nextInt();
			
			obj = new SessionObj("Subtract n weeks from a Date",new String[] {date, String.valueOf(number_of_weeks)});
			DateOperations.subtractWeeks(date, number_of_weeks, formatter);
			break;
		}
		case 8: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			System.out.println(labels.getString("ipNumMonths"));
			int number_of_months = sc.nextInt();
			
			obj = new SessionObj("Subtract n months from a Date",new String[] {date, String.valueOf(number_of_months)});			
			DateOperations.subtractMonths(date, number_of_months, formatter);
			break;
		}
		case 9: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			
			obj = new SessionObj("Determine the Day of the Week for a given date",new String[] {date});
			DateOperations.getDayofDate(date, formatter);
			break;
		}
		case 10: {
			System.out.println(labels.getString("ipDate"));
			String date = sc.next();
			
			obj = new SessionObj("Determine the Week number for a given a date",new String[] {date});
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
		// store the session
		SessionStorage.writeSession(obj);
	}
}
