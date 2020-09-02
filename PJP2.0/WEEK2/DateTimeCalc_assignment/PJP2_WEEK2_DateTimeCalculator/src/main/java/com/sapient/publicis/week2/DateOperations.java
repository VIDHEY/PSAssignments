package com.sapient.publicis.week2;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class DateOperations {

	public static void getDayofDate(String dt1, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		String result = date1.getDayOfWeek().toString();
		
		System.out.println("The Day on " + dt1 + " is " + result);
	}
	public static void getMonthofDate(String dt1, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		String result = date1.getMonth().toString();
		
		System.out.println("The Month of the Date " + dt1 + " is " + result);
	}
	public static void getWeekNumber(String dt1, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);

		TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
		int weekNumber = date1.get(woy);
		System.out.println("Weeknumber of Date " + date1 + " is " + weekNumber);
	}
	public static void getYear(String dt1, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		int result = date1.getYear();
		
		System.out.println("The Year of the Date " + dt1 + " is " + result);
	}
	public static void subtractDates(String dt1, String dt2, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		LocalDate date2 = LocalDate.parse(dt2, formatter);

		Period diff = Period.between(date1, date2);

		System.out.println("Difference between " + dt1 +" and " + dt2 + " is " + diff.getYears() + " years, " + diff.getMonths() + " months and " + diff.getDays() + " days.");
	}

	public static void addWeeks(String dt1, int nw, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		LocalDate result = date1.plusWeeks(nw);
		
		System.out.println("Date after " + nw + " Weeks of " + date1 + " :- " + result);

	}

	public static void addDays(String dt1, int nd, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		LocalDate result = date1.plusDays(nd);
		
		System.out.println("Date after " + nd + " Days of " + date1 + " :- " + result);
	}

	public static void addMonths(String dt1, int nm, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		LocalDate result = date1.plusMonths(nm);
		
		System.out.println("Date after " + nm + " Months of " + date1 + " :- " + result);

	}

	public static void subtractWeeks(String dt1, int nw, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		LocalDate result = date1.minusWeeks(nw);
		
		System.out.println("Date Before " + nw + " Weeks of " + date1 + " :- " + result);

	}

	public static void subtractDays(String dt1, int nd, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		LocalDate result = date1.minusDays(nd);
		
		System.out.println("Date Before " + nd + " Days of " + date1 + " :- " + result);
	}

	public static void subtractMonths(String dt1, int nm, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		LocalDate result = date1.minusMonths(nm);
		
		System.out.println("Date Before " + nm + " Months of " + date1 + " :- " + result);
	}
}
