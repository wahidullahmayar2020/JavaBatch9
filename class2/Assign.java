package com.class2;

import java.util.Scanner;

public class Assign {

	public static void main(String[] args) {
		
		int sodaprice;
		Scanner input=new Scanner(System.in);
		System.out.println("Please pay for your soda");
		do {
			sodaprice=input.nextInt();
		if (sodaprice>3) {
			System.out.println("Please give us less money");
		}else if (sodaprice<3) {
			System.out.println("Please give us more money");
		}
		} while (sodaprice!=3);
		System.out.println("Correct amount is entered");
		}}
