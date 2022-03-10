package com.assignment.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	/* Method to check validation of First name where regular expression of first name is defined */
	public static boolean validFirstName(String s) {
		
		Pattern p = Pattern.compile("\\b[A-Z][a-z]{2,30}\\b");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	}

	public static void main(String[] args) {
		
	    System.out.println("Welcome to User Registration Application Using Regex");
	    
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your first name  :");
		String firstname = s.nextLine();
		
		
		
		if(validFirstName(firstname) != true) 
		{
		System.out.println("First name should start with Capital letter and has minimum 3 character");	
		}
		else 
		{
		System.out.println("Name is valid");
		}
	}

}
