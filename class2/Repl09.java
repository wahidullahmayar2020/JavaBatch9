package com.class2;

import java.util.Scanner;

public class Repl09 {

	public static void main(String[] args) {


		Scanner recta=new Scanner(System.in);
		     System.out.println("Please enter the length");
		    int length=recta.nextInt();
		     System.out.println("Please enter the width");
		     int width=recta.nextInt();
		     if (length==width) {
		    	 System.out.println("The shape of your object is square");
		     }else {
		    	 System.out.println("The shape of your object is rectangle");
		     }
		     
		

	}

}
