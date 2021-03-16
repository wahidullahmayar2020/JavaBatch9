package com.class2;

public class ForInfor {

	public static void main(String[] args) {
	
//		Last edited < 1 minute agoClick to collapse
//		Print numbers from 1 to 100 in 1 line with space
//
//
//		Print numbers from 100 to 1
//
//
//		Print even numbers from 20 to 1 (2 ways)
//
//
//		Print odd numbers between 20 and 50 (2 ways)
	
		for(int a=100; a>=1; a--) {
		System.out.println(a+" ");
		a--;
		}
		
		
		/*
		 * 02
		 */

		for(int b=1; b<=100;b++) {
			System.out.println(b+" ");
		b++;
		}



//03
for(int c=20;c<=1;c+=2) {
	System.out.println(c+" ");
	c+=2;

	//04
	for(int d=20; d<=50; d++) {
		if(d%2==1) {
			System.out.println(d+" ");
		d++;	
		}
}}}}