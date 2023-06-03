package com.util;

public class RnD {
	
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
	}

	public static void main1(String[] args) {

		String name = "ram";
		String name2 = "ram2";

		
		//+ -> 1 N 
		//* -> 0 N 
		//? -> 0 1 
		
		String regex = "[a-zA-Z]+";
		
		System.out.println(name.matches(regex));
		System.out.println(name2.matches(regex));
		
		
		String email = "test@gmail.com";
		String email2 = "test.com";
		String email3 = "test@@gmail.com";
		String email4 = "test@yopmail.education.edu";
		String email5 = "test@testeteste.terererere"; 
		
		String emailRegex = "[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z][a-zA-Z][a-zA-Z]?";
		
		System.out.println(email.matches(emailRegex));
		System.out.println(email2.matches(emailRegex));
		System.out.println(email3.matches(emailRegex));
		System.out.println(email4.matches(emailRegex));
		System.out.println(email5.matches(emailRegex));
		
		
	}
}
