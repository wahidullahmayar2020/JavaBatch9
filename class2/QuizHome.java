package com.class2;

public class QuizHome {

	public static void main(String[] args) {
		
//		Print numbers from 1 to 100 in 1 line with space
//
//
//		Print numbers from 100 to 1
//
//
//		Print even numbers from 20 to 100
		
		int num=1;
		while (num<=100) {
			System.out.print(num+" ");
			num++;
		}
			//2
			int num1=100;
			while (num1>=1) {
				System.out.print(num1+" ");
				num1--;
			}
			
		int num3=20;
		while (num3<=100) {
			System.out.println(num3+" ");
			num3+=2;
			
			/*
			 * 03
			 * 
			 */
			int num4=20;
			while (num4<=100) {
				if(num4%2==0) {
					System.out.println(num4+" ");
					
			}
				num4++;
			}
			
		}
	}

}
