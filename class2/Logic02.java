package com.class2;

import java.util.Scanner;

public class Logic02 {

	public static void main(String[] args) {

		int height=70;
		
		
		if(height<60) {
			System.out.println("your short");
		}else if(height>60 && height<72 ) {
			System.out.println("your medium");
		}else if(height>72) {
			System.out.println("your tall");
		}
//*HW2

		
Scanner  input=new Scanner(System.in);
System.out.println("Enter the day number");
int daynumber=input.nextInt();
if(daynumber>1 && daynumber<5) {
	System.out.println("it is weekday");
}else if(daynumber>6 && daynumber==9) {
	System.out.println("It is weekend");
}else {
	System.out.println("Invalid day");
}

	  }
}


