package com.elfun;

import java.util.Date;

public class GreetFun {

	public static String greet() {

		Date d = new Date();

		int h = d.getHours(); // 24

		if (h >= 0 && h <= 11) {
			return "Good Morning";
		} else if (h >= 12 && h <= 17) {
			return "Good AfterNoon";
		} else {
			return "Good Evening";
		}

	}
}
