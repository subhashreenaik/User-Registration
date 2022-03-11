package com.assignment.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	/* Method to check validation of First and last name
	 *  where regular expression of first and last name is defined */
	public static boolean validForName(String s) 
	    {
		
		Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }
	/* Method to check validation of EmailId
	 *  where regular expression of emailId is defined */
    public static boolean validEmailId(String s) {
		
		Pattern p = Pattern.compile("[a-z]{2,}(((.?)[+-]*(_?)*[a-z0-9]*){2,})*@[a-z]{1,}.[a-z]{1,}(.[a-z]*{1,})*");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }
 public static boolean validMobileNo(String s) {
		
		Pattern p = Pattern.compile("91 [0-9]{10}");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }

	public static void main(String[] args) {
		
	    
	    
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your first name  :");
		String firstname = s.nextLine();
		System.out.println("Enter your last name  :");
		String lastname = s.nextLine();
		System.out.println("Enter your emailID  :");
		String emailid = s.nextLine();
		System.out.println("Enter your mobile Number  :");
		String mobileno = s.nextLine();
		
		if(validForName(firstname) != true) 
		{
		System.out.println("First name should start with Capital letter and has minimum 3 character");	
		}
		if(validForName(lastname) != true) 
		{
		System.out.println("Last name should start with Capital letter and has minimum 3 character");	
		}
		if(validEmailId(emailid) != true) 
		{
		System.out.println("Please give a valid emailID");	
		}
		if(validMobileNo(mobileno) != true) 
		{
		System.out.println("Please give a valid mobile Number");	
		}
		else 
		{
		System.out.println("String is valid");
		}
	}

}
