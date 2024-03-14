package com.coderscampus;

import java.util.Scanner;

public class Week2Example {

	public static void main (String [] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in your name: ");
		String name = scanner.nextLine ();
		System.out.println("Type in your age ");
		String age = scanner.nextLine();
		
		if (name.equals("Casey") 
				&& age.equals("40")) {
			System.out.println("Holy cow, its me!");
		} else {
			System.out.println("Hello: " + name);
		}
				
		scanner.close();
				
		
	}
}