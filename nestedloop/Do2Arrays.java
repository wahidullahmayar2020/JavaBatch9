package com.nestedloop;

public class Do2Arrays {

	public static void main(String[] args) {
          
//		Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops
//
//
//		Using 2D array create a grocery list.
//		Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
		
		
		
		String [][] cars= {
				{"Ford","GMC","Chevey"},
				{"BMR","Mercedez","Audi"},
				{"KIA","Hundai","Huyndai"},
				{"Ferrari","Lemberghoni","Bogati"},
		};
		
				System.out.println(cars.length);
				
				for(int r=0; r<cars.length; r++) {
				for(int c=0; c<cars[r].length;c++) {
					System.out.println(cars[r][c]+" ");
					
				}
				System.out.println();
				} 
	// 
				System.out.println("------------------enhanced array loop-------");
//				enhanced loop
				for(String[] types:cars) {
					for(String models:types) {
						System.out.println(models+" ");
			}
				
				System.out.println();
				}
				
	
	
	}

}
