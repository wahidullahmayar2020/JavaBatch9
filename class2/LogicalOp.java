package com.class2;

import java.util.Scanner;

public class LogicalOp {

	public static void main(String[] args) {
	
		int age;
		String name;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String  name1=input.next();
		System.out.println("Please enter your age");
	    int   age1=input.nextInt();
	    
	    if(age1>=1 && age1<3) {
	    	System.out.println("Your baby");
	    }else if (age1>=3 && age1<5) {
	    	System.out.println("your bigger baby");
	    }else if (age1>=5 && age1<=12) {
	    	System.out.println("your a kid");
	    }else if(age1>=13 && age1<=19) {
	     	System.out.println("your a teenagetr");
	    }
	    
	      
		
		
		
		

	}

}
