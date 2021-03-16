package com.nestedloop;

public class GroupWork {

	public static void main(String[] args) {
		
//		Maximum and minimum number in the array?
				
			
		
		int [] number= {1000,12,17,99,24,1};
		    
				
				int  maxvalue=number[0];
				
		
		for(int i=0; i<number.length;i++) {
			if(number[i]>maxvalue) {
				maxvalue=number[i];
				
			}
		}
		int minvalue=number[0];
		for(int i=0;i<number.length;i++){
			if(number[i]<minvalue) {
				minvalue=number[i];
				
				
			}
			
		}
		
		System.out.println(minvalue);
		System.out.println(maxvalue);
		
		
	}

	}
