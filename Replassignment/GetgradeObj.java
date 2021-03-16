package com.Replassignment;

import java.util.Scanner;

public class GetgradeObj {

	public static void main(String[] args) {
		Scanner Scan3=new Scanner(System.in);
		Getgrade1 obj3=new Getgrade1();
		int score;
		System.out.println("Please enter your score");
		score=Scan3.nextInt();
		System.out.println("Your grade is "+obj3.getGrade(score));
		
		

	}

}
