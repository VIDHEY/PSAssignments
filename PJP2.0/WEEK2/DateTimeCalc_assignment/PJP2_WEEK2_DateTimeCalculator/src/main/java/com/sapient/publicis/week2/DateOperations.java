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

		System.out.println(date1.getDayOfWeek().toString());
	}
	public static void getMonthofDate(String dt1, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);

		System.out.println(date1.getMonth().toString());
	}
	public static void getWeekNumber(String dt1, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);

		TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
		int weekNumber = date1.get(woy);
		System.out.println(weekNumber);
	}
	public static void getYear(String dt1, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);

		System.out.println(date1.getYear());
	}
	public static void subtractDates(String dt1, String dt2, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);
		LocalDate date2 = LocalDate.parse(dt2, formatter);

		Period diff = Period.between(date1, date2);

		System.out.printf("Difference is %d years, %d months and %d days old", diff.getYears(), diff.getMonths(),
				diff.getDays());
	}

	public static void addWeeks(String dt1, int nw, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);

		date1 = date1.plusWeeks(nw);
		System.out.println(date1);

	}

	public static void addDays(String dt1, int nd, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);

		date1 = date1.plusDays(nd);
		System.out.println(date1);

	}

	public static void addMonths(String dt1, int nm, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);

		date1 = date1.plusMonths(nm);
		System.out.println(date1);

	}

	public static void subtractWeeks(String dt1, int nw, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);

		date1 = date1.minusWeeks(nw);
		System.out.println(date1);

	}

	public static void subtractDays(String dt1, int nd, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);

		date1 = date1.minusDays(nd);
		System.out.println(date1);

	}

	public static void subtractMonths(String dt1, int nm, DateTimeFormatter formatter) throws ParseException {
		LocalDate date1 = LocalDate.parse(dt1, formatter);

		date1 = date1.minusMonths(nm);
		System.out.println(date1);

	}

}
