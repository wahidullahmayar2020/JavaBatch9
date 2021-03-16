package com.class2;

import java.util.Scanner;

public class ScannClass {

	public static void main(String[] args) {


		Scanner Scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1=Scan.nextInt();
		System.out.println("Please enter second number");
		int number2=Scan.nextInt();
		if(number1*number2>0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
		

	}

}
