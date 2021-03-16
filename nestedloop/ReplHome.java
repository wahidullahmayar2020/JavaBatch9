package com.nestedloop;

public class ReplHome {

	public static void main(String[] args) {
//		**For you to do:** 
//
////		Create a for loop that prints out even numbers from 2 to 14 using if condition
////
////		Must include the number 14 in the output 
////
////		**Output:**  
//
//		int even=0;
//		int odd=0;
//		
//		for(int i=1;i<=50;i++) {
//			if(even%2==0) {
//				even+=i;
//		}else {
//			if(odd%2==1) {
//				odd+=i;
//		
//		}
//		}
//		System.out.println("sum of even numbers "+even);
//		System.out.println("sum of even numbers "+odd);
//		}}}

for(int f=2;f<=14;f++) {
	if(f%2==0) {
		System.out.println(f);
	}
}

//11
for(int k=5;k<22;k++) {
	if(k%2==1) {
		System.out.println(k);
	}
}


//13
//Using for loop print "Good Morning" 20 times

for(int g=20;g>=1;g--) {
	System.out.println("Good Morning");
}
//14
//Write a program that prints the string "Hey, it is year: " 
//and the years between 2011 and 2019.

for(int y=2011;y<=2019;y++) {
	System.out.println("Hey, it is year:"+y);
	
}
	}

}
