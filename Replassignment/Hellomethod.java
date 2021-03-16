package com.Replassignment;

public class Hellomethod {
//
//	
//	2:18
//	
	
	
	String greeting(String st1) {
		String input;
		switch (st1.toLowerCase()) {

		case "usa":
			input = "Hello";
			break;
		case "spain":
			input = "Hola";
			break;
		case "afghanisan":
			input = "Salam";
			break;
		case "russia":
			input = "Privet";
			break;
		case "itlay":
			input = "Ciao";
			break;
		default:
			input = "Unkown";
		}
		return input;
	}
}
