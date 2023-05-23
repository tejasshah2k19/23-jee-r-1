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

	// (1[])
	public static boolean validPassword(String password) {
		if (password.length() < 8) {
			return false;
		} else if (password.matches(".*[A-Z]+.*") == false) {
			System.out.println("A-Z");
			return false;
		} else if (password.matches(".*[a-z]+.*") == false) {
			return false;
		} else if (password.matches(".*[0-9]+.*") == false) {
			return false;
		} else if (password.matches(".*[$^&*@#]+.*") == false) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
//		System.out.println(validPassword("test"));
		// System.out.println(validPassword("test@123"));
		System.out.println(validPassword("12121221212T12"));

	}

}
