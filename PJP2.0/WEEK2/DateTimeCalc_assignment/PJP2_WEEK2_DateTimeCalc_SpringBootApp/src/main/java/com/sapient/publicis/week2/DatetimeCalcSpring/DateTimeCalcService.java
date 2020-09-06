package com.sapient.publicis.week2.DatetimeCalcSpring;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

import org.springframework.stereotype.Component;

@Component
public class DateTimeCalcService {

	public String addNDays(String date,String numOfDays)
	{
		LocalDate dt = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		dt = dt.plusDays(Integer.parseInt(numOfDays));
		return dt.toString();
	}
	public String addNWeeks(String date,String numOfWeeks)
	{
		LocalDate dt = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		dt = dt.plusWeeks(Integer.parseInt(numOfWeeks));
		return dt.toString();
	}
	public String addNMonths(String date,String numOfMonths)
	{
		LocalDate dt = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		dt = dt.plusMonths(Integer.parseInt(numOfMonths));
		return dt.toString();
	}
	public String subtractNDays(String date,String numOfDays)
	{
		LocalDate dt = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		dt = dt.minusDays(Integer.parseInt(numOfDays));
		return dt.toString();
	}
	public String subtractNWeeks(String date,String numOfWeeks)
	{
		LocalDate dt = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		dt = dt.minusWeeks(Integer.parseInt(numOfWeeks));
		return dt.toString();
	}
	public String subtractNMonths(String date,String numOfMonths)
	{
		LocalDate dt = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		dt = dt.minusMonths(Integer.parseInt(numOfMonths));
		return dt.toString();
	}
	public String getDayOfWeek(String date) {
		LocalDate dt = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String result = dt.getDayOfWeek().toString();
		
		return result;
	}
	public String getWeeknumOfYear(String date) {
		LocalDate dt = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
		int weekNumber = dt.get(woy);
		return String.valueOf(weekNumber);
	}
	
}
