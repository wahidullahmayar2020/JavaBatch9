package com.nestedloop;

public class Dog {

	
	
		String breed,Colour,Size;
		int age;
		public void bark() {
			System.out.println("Rof Rof Raf");
		}
		public void sleep() {
			System.out.println("Sleeping.");
		}
		public void look() {
			System.out.println("Hi I am a dog my color is"+" "+Colour);
			
		}
		
		
		public static void main(String[] args) {
		Dog bulldog= new Dog();
		bulldog.age=7;
		bulldog.Size="large";
		bulldog.Colour="Red";
		bulldog.breed="American dogs";
		bulldog.bark();
		bulldog.sleep();
		bulldog.look();
		
		
		
		Dog beagle=new Dog();
		beagle.age=8;
		beagle.breed="German Shepered";
		beagle.Colour="White black";
		beagle.Size="Medium";
		beagle.look();
		
		
	
		
		
		//////////////////////////////
		
		
		

	}

}
