package com.class2;

import java.util.Scanner;

public class ReplHw1 {

	public static void main(String[] args) {

        boolean isSunny=true;
		
		int temp=100;
		
		Scanner input=new Scanner(System.in);
		System.out.println("how is the weather outside");
		isSunny=input.nextBoolean();
		
		if(isSunny) {
			System.out.println("It is a sunny day, I should go somewhere!");
		}else {
			System.out.println("I stay home and practice Java");
		}if(isSunny) {
			System.out.println("What is the temperature outside?");
			temp=input.nextInt();
		} if (temp>85) {
			System.out.println("I am going to the beach");
			
		}else {
			System.out.println("I am going to the park");
		}
		}
		
		

	}

