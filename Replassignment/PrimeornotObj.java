package com.Replassignment;

import java.util.Scanner;

public class PrimeornotObj {
	
	public static void main(String[] args) {

		Primeornot obj2 = new Primeornot();
		Scanner scan1 = new Scanner(System.in);
		int bravo;
		System.out.println("Please enter if number is prime or not");
		bravo = scan1.nextInt();
		System.out.println(obj2.Prime(bravo));

	}

}