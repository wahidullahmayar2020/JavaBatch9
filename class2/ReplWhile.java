package com.class2;

public class ReplWhile {

	public static void main(String[] args) {
//		Using while loop print numbers from 0 to 8

		int a = 0;
		int b = 8;

		while (a <= b) {
			System.out.println(a);
			a++;
		}
		// Repl02

//		Using while loop print numbers from 15 to 0

		int c = 15, d = 0;
		while (c >= d) {
			System.out.println(c);
			c--;
		}
		// Repl03
//		Using while loops that print out even numbers from 1 to 13

		int k = 1, f = 13;
		while (k <= f) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
			k++;
		}
//04
//Write a java program to print  "Hello Syntax Team! How are you?"  three times using the while loop
//
		int g = 1;
		while (g <= 3) {
			System.out.println("Hello Syntax Team! How are you?");
			g++;
		}
		
		//05
//		Step 1: Initialize the i value as int i=7.
//
//				Step 2: Write a program to print a sequence of numbers starting from 7 to 98. 

int i=7;
while(i<=98) {
	System.out.println(i);
	if(i%7==0) {		
	}
i+=7;
}
//06
//Using do while loop print numbers from 10 to 20
//
//Must not include the number 20 in the output 
int  h=10;
do {
	System.out.println(h);
	h++;
} while(h<20);
	
	//07

//Create a do while loop that prints out "Hello World!" 5 times. 
	int y=1;
do {
	System.out.println("Hello World!");
	y++;
}while(y<=5);
//08
//Using do while loop print even numbers from 20 to 1
int q=20;
do {
	System.out.println(q);
	q-=2; 
}while(q>=1);
//09

//Create a for loop that prints out numbers from 0 to 12
//
//Must not include the number 12 in the output 
for(int u=0;u<12;u++) {
if(u==12) {
	continue;
}
System.out.println(u);
}
//10
//Create a for loop that prints out even numbers from 10 to 0
//
//Must not include the number 0 in the output 

for(int l=10; l>0;l--) {
	if(l%2==0) {
	}
	System.out.println(l);
}
}}
