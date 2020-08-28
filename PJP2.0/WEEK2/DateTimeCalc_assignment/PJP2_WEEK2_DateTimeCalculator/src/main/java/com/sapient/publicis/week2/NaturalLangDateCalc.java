package com.sapient.publicis.week2;

import java.time.LocalDate;
import java.util.Scanner;

public class NaturalLangDateCalc {

	public static void DateCalc() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input(eg.:- Today, next month, last year, n days from now etc.) :-  ");

		String input = sc.nextLine();
		input = input.toLowerCase();

		LocalDate lt = LocalDate.now();

		if (input.contains("next")) {
			if (input.contains("month")) {
				System.out.println(lt.plusMonths(1).getMonth());
			} else if (input.contains("year")) {
				System.out.println(lt.plusYears(1).getYear());
			} else if (input.contains("week")) {
				System.out.println(lt.plusWeeks(1));
			}

		} else if (input.contains("last")) {
			if (input.contains("month")) {
				System.out.println(lt.minusMonths(1).getMonth());
			} else if (input.contains("year")) {
				System.out.println(lt.minusYears(1).getYear());
			} else if (input.contains("week")) {
				System.out.println(lt.minusWeeks(1));
			}

		} else if (input.contains("from now")) {
			int num = Integer.parseInt(input.replaceAll("[^\\d]", "").trim());

			if (input.contains("day")) {
				System.out.println(lt.plusDays(num));
			} else if (input.contains("week")) {
				System.out.println(lt.plusWeeks(num));
			} else if (input.contains("month")) {
				System.out.println(lt.plusMonths(num));
			} else if (input.contains("year")) {
				System.out.println(lt.plusYears(num));
			}
		} else if (input.contains("earlier")) {
			int num = Integer.parseInt(input.replaceAll("[^\\d]", "").trim());

			if (input.contains("day")) {
				System.out.println(lt.minusDays(num));
			} else if (input.contains("week")) {
				System.out.println(lt.minusWeeks(num));
			} else if (input.contains("month")) {
				System.out.println(lt.minusMonths(num));
			} else if (input.contains("year")) {
				System.out.println(lt.minusYears(num));
			}
		} else if (input.contains("today"))
			System.out.println(lt);
		else if (input.contains("tomorrow") || input.contains("next day"))
			System.out.println(lt.plusDays(1));
		else if (input.contains("yesterday") || input.contains("previous day"))
			System.out.println(lt.minusDays(1));
		else {
			System.out.println("Unsupported Operation!!");
		}
	}
}
