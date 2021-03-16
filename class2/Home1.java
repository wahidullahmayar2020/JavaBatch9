package com.class2;

import java.util.Scanner;

public class Home1 {

	public static void main(String[] args) {

		String country, language;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your country");

		country = input.nextLine();

		switch (country) {
		case "USA":
			language = "English";
			break;
		case "Spain":
			language = "Spanish";
			break;
		case "Iran":
			language = "Persien";
			break;
		case "Afghanistan":
			language = "Farsi";
		default:
			language = "unkonwn";
		}
		System.out.println("Your language is" + language);

		// HW2

		String grade;
		Scanner result = new Scanner(System.in);
		System.out.println("Enter your grade");
		grade = result.next();

		switch (grade) {
		case "A":
			grade = "Excellent";
			break;
		case "B":
			grade = "Good";
			break;
		case "C":
			grade = "Average";
			break;
		case "D":
			grade = "Bad";
			break;
		default:
			grade = "Not acceptable";

		}

		System.out.println("Grade your entered is " + grade);

		Scanner calculator;

		int num1, num2, result1 = 0;

		char operator;

		Scanner calculator1 = new Scanner(System.in);
		System.out.println("Enter your two numbers");
		num1 = calculator1.nextInt();
		num2 = calculator1.nextInt();
		System.out.println("Enter your operator to perfrom");
		operator = calculator1.next().charAt(0);
		switch (operator) {
		case '+':
			result1 = num1 + num2;
			break;
		case '-':
			result1 = num1 - num2;
			break;
		case '*':
			result1 = num1 * num2;
			break;
		case '/':
			result1 = num1 / num2;
			break;
		default:
			result1 = 0;
			System.out.println("Not a valid number");

		}
		System.out.println(num1 + " " + operator + " " + num2 + "=" + result1);

	}

}
