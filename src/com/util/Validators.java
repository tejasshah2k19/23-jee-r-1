package com.util;

public class Validators {

	// required
	public static boolean isEmpty(String data) {
		if (data == null || data.trim().length() == 0) {
			return true;
		}
		return false;
	}

	// format
	public static boolean isAlpha(String data) {
		return data.matches("[a-zA-Z]+");
	}

	public static boolean isEmail(String data) {
		String emailRegex = "[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z][a-zA-Z][a-zA-Z]?";
		return data.matches(emailRegex);
	}

	
}
