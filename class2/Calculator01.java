package com.class2;

import java.util.Scanner;

public class Calculator01 {

	public static void main(String[] args) {
		Scanner  calculator;
		
		int num1,num2,result=0;
		
		char  operator;
		
		Scanner calculator1=new Scanner(System.in);
		System.out.println("Enter your two numbers");
		num1=calculator1.nextInt();
		num2=calculator1.nextInt();
		System.out.println("Enter your operator to perfrom");
		operator=calculator1.next().charAt(0);
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
			default:
				result=0;
				System.out.println("Not a valid number");


	}
System.out.println(num1+" "+operator+" "+num2+"="+result);

}
}