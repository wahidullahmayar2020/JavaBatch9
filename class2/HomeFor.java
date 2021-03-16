package com.class2;

public class HomeFor {

	public static void main(String[] args) {
		int even=0;
		int odd=0;
		
		for(int i=1;i<=50;i++) {
			if(even%2==0) {
				even+=i;
		}else {
			if(odd%2==1) {
				odd+=i;
		
		}
		}
		System.out.println("sum of even numbers "+even);
		System.out.println("sum of even numbers "+odd);
		}}}