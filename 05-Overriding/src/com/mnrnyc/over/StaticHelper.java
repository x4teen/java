package com.mnrnyc.over;

import java.time.LocalDate;

public class StaticHelper {

	public static void printMessage(String message) {
		System.out.println("Messge for " + LocalDate.now() +": "+ message);
	}
}
