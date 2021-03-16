package com.class2;

import java.util.Scanner;

public class ReplHm02 {

	public static void main(String[] args) {
		
		Scanner  input=new Scanner(System.in);
		char  gender='M';
		int age=23;
		
		
		System.out.println("Please enter your gender");
		gender=input.next().charAt(0);
		System.out.println("Please enter your age");
		age=input.nextInt();
		if(age>=25) {
		if(gender=='F') {
			System.out.println("Women");
		}
		if(gender=='M') {
			System.out.println("Man");}
		}
		if(age<25) {	
		if(gender=='M') {
			System.out.println("Girl");
		}else {
			System.out.println("Boy");
		}
		
		
		
	}

}
}