package com.Replassignment;

import java.util.Scanner;

public class Countrymethod2 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		Hellomethod resultObj = new Hellomethod();
		String Country;
		System.out.println("Enter your Country");
		Country = Scan.next();
		System.out.println(resultObj.greeting(Country));
		
		   
		   
		
		

	}

}
