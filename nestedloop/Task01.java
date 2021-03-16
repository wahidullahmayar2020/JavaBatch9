package com.nestedloop;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
//   double k;
//   Scanner input;
//   double sumofk=0;
//   double [] array;
//   
//  input=new Scanner(System.in);
//  System.out.println("Enter your double value digits");
//  int J=input.nextInt();
//  array=new double[J];
//  for(int i=0; i<J;i++) {
//	  
//  }
  
   
   //
  
  
//  Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
//  After storing values print the following:
//  Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
//
//  Create a 2D array that first row will contain 4 names and second row will contain grades. Then your program should print name of the students that has A and B grade
//
//
//  Click to expand inline
  
  String[][] titles=new String[0][4];
  titles[0][1]="Mr,";
  titles[1][2]="Mrs,";
  titles[2][3]="Ms,";
  titles[3][4]="Miss,";
  
  titles[1][1]="Smith";
  titles[1][2]="Jordan";
  titles[1][3]="Jackson";
  titles[1][4]="Obama";
  
  
System.out.println(titles[1][2]+ titles[1][1]+titles[0][1]+titles[1][4]+titles[2][3]+titles[1][3]+titles[3][4]+titles[1][2]);

}

}
