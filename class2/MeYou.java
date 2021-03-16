package com.class2;

import java.util.Scanner;

public class MeYou {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter month number");
		   int   month=scan.nextInt();
		if (month==1) {
		System.out.println("It is January");
		}else if (month==2) {
			System.out.println("It is February");
		}else if (month==3) {
			System.out.println("It is March");
		}else if (month==4) {
			System.out.println("It is April");
		}else if (month==5) {
			System.out.println("It is May");
		}else if (month==6) {
			System.out.println("It is June");
		}else if(month==7) {
				System.out.println("It is July");
			}else if(month==8) {
				System.out.println("It is August");
				}else if (month==9) {
					System.out.println("It is September");
				}else if (month==10) {
					System.out.println("It is October");
				}else if (month==11) {
					System.out.println("It is November");
				}else if (month==12) {
					System.out.println("It is December");
				}else {
	       System.out.println("It is an invalid month");
		}
	}
}