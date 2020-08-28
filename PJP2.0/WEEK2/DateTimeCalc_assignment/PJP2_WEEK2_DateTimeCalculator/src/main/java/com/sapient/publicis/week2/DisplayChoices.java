package com.sapient.publicis.week2;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class DisplayChoices {
	public static Locale locale;
	public static ResourceBundle labels;
	
	public static void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Language:- ");
		System.out.println("1:- English");
		System.out.println("2:- French");
		System.out.println("3:- Spanish");

		System.out.println("Enter your choice :- ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			locale = new Locale("en", "US");
			labels = ResourceBundle.getBundle("test", locale);
			break;
		}
		case 2: {
			locale = new Locale("fr", "FR");
			labels = ResourceBundle.getBundle("test", locale);
			break;
		}
		case 3: {
			locale = new Locale("es", "ES");
			labels = ResourceBundle.getBundle("test", locale);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}

		System.out.println("************************************");
		System.out.println("Operations :-");
		System.out.println(labels.getString("ope1"));
		System.out.println(labels.getString("ope2"));
		System.out.println(labels.getString("ope3"));
		System.out.println(labels.getString("ope4"));
		System.out.println(labels.getString("ope5"));
		System.out.println(labels.getString("ope6"));
		System.out.println(labels.getString("ope7"));
		System.out.println(labels.getString("ope8"));
		System.out.println(labels.getString("ope9"));
		System.out.println(labels.getString("ope10"));
		System.out.println(labels.getString("ope11"));
		System.out.println("************************************");
		System.out.println(labels.getString("note"));
		System.out.println("");
		System.out.println(labels.getString("opeChoice"));
	}
}
