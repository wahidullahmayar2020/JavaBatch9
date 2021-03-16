package com.class2;

import java.util.Scanner;

public class AssignClass {

	public static void main(String[] args) {
		
		int   quiz, mid term, final score;
		
		
		Scanner   input=new Scanner(System.in);
		System.out.println("Please Enter Your Score");
		double avegscore=input.nextDouble();
		String Grade1=input.next();
		if(avegscore>=90) {
          Grade1="A";
	}else if(avegscore>=70 && avegscore<90) {
		Grade1="B";
	}else if(avegscore>=50 && avegscore<70) {
		Grade1="C";
	}else {
		if(avegscore<50){ 
			Grade1="F";
		}
	}
	}

}
