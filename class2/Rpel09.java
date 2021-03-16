package com.class2;

import java.util.Scanner;

public class Rpel09 {

	public static void main(String[] args) {


		boolean   loan=true;
		
		int   creditscore;
		
		Scanner   input=new Scanner(System.in);
		System.out.println("Do you need a loan?");
		loan=input.nextBoolean();
		System.out.println("What is your credit score?");
		creditscore=input.nextInt();
		if (creditscore<600) {
			System.out.println("Not eligible");
		}else if (creditscore>=600 && creditscore<=700) {
			System.out.println("Maybe eligible");
		}else if(creditscore>=701 && creditscore<=800) {
			System.out.println("Eligible");
		}else {
			System.out.println("Definitely eligible");
		}
	}

}
