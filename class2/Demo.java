package com.class2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		Print numbers from 1 to 50 except those that are divisible by 3
//
//
//		Create a program that will keep asking user to apply for a credit card. As soon you get “yes” from a user program should stop asking.
//
//
//		Click to expand inline
		
	
		for(int a=1;a<=50; a++) {
			if(a%3==0) {
				continue;
			}
			System.out.println(a);
		}
    
		//02
		Scanner input=new Scanner(System.in);
		
		String answer;
		do {
			System.out.println("Do you want to Apply for a credit card");
			answer=input.next();
		}while (!answer.equalsIgnoreCase("Yes"));
			
		System.out.println("Your credit card will be applyed right now");
	
	}}
		//03
//				Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers.	
//	
			
//* Write a program to ask a user to enter item they want to buy and the price of that item. 
//* Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
//* If user give more money program should return a change. 
//* Whenever a user done with payments program should say "Thank you for shopping!"
//*/

Scanner input = new Scanner(System.in);
String item;
int price;
int money;
int remainder;
int sum=0;

System.out.println("Please enter an item you would like to buy");
item=input.nextLine();

System.out.println("Please enter the price of "+item);
price=input.nextInt();
System.out.println("Please pay for "+item);

do {
   money=input.nextInt();
   sum+=money;
   
   if (sum<price) {
       
       remainder=price-sum;
       
       System.out.println("Please give "+remainder);
       
   }else if (sum>price){
       
       remainder=sum-price;
       
       System.out.println("Here is your change "+remainder);
       
       break;
       
   }else {
       System.out.println("You got the right amount");
   }
   
}while(price!=sum);

System.out.println("Thank you for shopping");
		
	


