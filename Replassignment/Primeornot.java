package com.Replassignment;

public class Primeornot {
//	Write a method to return whether given number is prime or not?

	boolean Prime(int bravo) {
		boolean bool1 = true;
		if (bravo > 1) {
			for (int i = 2; i < bravo; i++) {
				if (bravo % i == 0) {
					bool1 = false;
					break;
				}
			}
		} else {
			bool1 = false;
		}
		if (bool1) {
			return true;
		} else {
			return false;
		}
	}
}
