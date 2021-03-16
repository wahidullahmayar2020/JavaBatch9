package com.nestedloop;

public class Arrays {

	public static void main(String[] args) {

		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';

		System.out.println(grades[4]);

		
		///02 exercise
		
//		Create an array of names and store all names of your group. 
//		Then print your name from that array. (use 2 different ways of creating an array).
//
//
//		Create an array of words: Java, Saturday, day, coding, is.
//		Print the following sentence using elements of array: “Saturday is Java coding Day”.
	
	String[] names=new String[4];
	names[0]="MJ";
	names[1]="Grey";
	names[2]="Zoe";
	names[3]="nicole";
	System.out.println(names[0]);
	
	
	String[] name= {"MJ","Grey","Zoe","nicole"};
	System.out.println(names[0]);
	
	//
	String[] words=new String[5];
	words[0]="Saturday";
	words[1]="is";
	words[2]="Java";
	words[3]="coding";
	words[4]="Day";
	System.out.println(words[0]+" "+ words[1] +" "+ words[2] +" "+ words[3] +" "+ words[4] );
	
			

}
}