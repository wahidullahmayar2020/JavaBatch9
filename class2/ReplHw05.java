package com.class2;

import java.util.Scanner;

public class ReplHw05 {

	public static void main(String[] args) {
	
		int num1=3,num2=5,num3=7;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers   and    ");
	    num1=input.nextInt();
	    if(num1>num2) {
	    	System.out.println("the largest number is"+num1);
	    }else if(num1>num3) {
	    	System.out.println("the largest number is"+num1);
	    }else {	
	    if (num2>num1) {
	    	System.out.println("the largest number is"+num2);
	    }else if(num2>num3) {
	    	System.out.println("the largest number is"+num2);
	    }else {
	    if(num3>num1) {
	    	System.out.println("the largest number is"+num3);
	    }else if (num3>num2) {
	    	System.out.println("the largest number is"+num3);
	    }}}}}


