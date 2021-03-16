package com.class2;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		
		
		Scanner  Alpha=new Scanner(System.in);
		System.out.println("Please enter your age");
        int	age=Alpha.nextInt();
   if(age>=18) {
		System.out.println("You are eligible to vote");
	}else {
		System.out.println("You are not eligible to vote");

		}

	}

}
