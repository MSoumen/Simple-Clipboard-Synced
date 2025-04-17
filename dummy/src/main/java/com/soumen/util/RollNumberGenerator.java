package com.soumen.util;

public class RollNumberGenerator {
	private static Integer counter=0;
	public static synchronized Integer generate() {
		return ++counter;
	}
}
