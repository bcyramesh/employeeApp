/**
 * 
 */
package com.haarisinfo.util;

import java.util.Scanner;

/**
 * @author Utility class to accept data from keyboard
 */
@SuppressWarnings("resource")
public class KeyboardUtil {

	/**
	 * 
	 * @param message
	 *            message to print on console
	 * @return int fetched from keyboard
	 */
	public static int getInt(String message) {
		System.out.println(message);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	/**
	 * 
	 * @param message
	 *            message to print on console
	 * @return Double fetched from keyboard
	 */
	public static double getDouble(String message) {
		System.out.println(message);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}

	/**
	 * 
	 * @param message
	 *            message to print on console
	 * @return String fetched from keyboard
	 */
	public static String getString(String message) {
		System.out.println(message);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}
