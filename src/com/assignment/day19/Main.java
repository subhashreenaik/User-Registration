package com.assignment.day19;

import java.util.Scanner;

public class Main {

	/**
	 * This is the main method to manipulate the UserRegistration class
	 */
	public static void main(String[] args) {
		
		UserRegistration user=new UserRegistration();
		Scanner s=new Scanner(System.in);
		/*
		 * Calling the method to check validation of the samples of email id.
		 */
		user.sampleEmailvalidation();
		user.sampleEmailInvalidation();
		
		/*
		 * Here we are taking user input as first name ,last name,emailid,password,phone number.
		 */
		System.out.println("Enter your First name  :");
		String firstname = s.nextLine();
		System.out.println("Enter your last name  :");
		String lastname = s.nextLine();
		System.out.println("Enter your emailID  :");
		String emailid = s.nextLine();
		System.out.println("Enter your mobile Number  :");
		String mobileno = s.nextLine();
		System.out.println("Enter your Password  :");
		String password = s.nextLine();
		
		if(user.validForName(firstname) != true) 
		{
		System.out.println("First name should start with Capital letter and has minimum 3 character");	
		}
		if(user.validForName(lastname) != true) 
		{
		System.out.println("Last name should start with Capital letter and has minimum 3 character");	
		}
		if(user.validEmailId(emailid) != true) 
		{
		System.out.println("Please give a valid emailID");	
		}
		if(user.validMobileNo(mobileno) != true) 
		{
		System.out.println("Please give a valid mobile Number");	
		}
		if(user.validPassword(password) != true) 
		{
		System.out.println("Please give a valid Password");	
		}
		else 
		{
		System.out.println("String is valid");
		}
		
		
		
		
	}
}


