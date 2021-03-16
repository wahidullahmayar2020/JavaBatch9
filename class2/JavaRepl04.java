package com.class2;

import java.util.Scanner;

public class JavaRepl04 {
	public static void main(String[] args) {
	
		
	   int   num1;
	   
		
		
		Scanner  result=new Scanner(System.in);
	
		System.out.println("Enter any number");
		num1=result.nextInt();
		if(num1%2==0) {
			System.out.println("Value is even");
		}else {
			System.out.println("Value is odd");
		}
		
	if(num1%2>1000) {
			System.out.println("Even value is large");
		}else {
			System.out.println("Even value is just right");
		}
		
	}
}
