/**
 * 
 */
package com.assignment.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author subhashree
 *
 */
@FunctionalInterface
interface Validation{
	public boolean validateUserEntry(String str);
}



public class UserRegistrationUsingLambada {

	/**
	 * @param str ->passing string value to check the regular pattern
	 */
	public static void main(String[] args) {
		
		
		/**declare a reference to Validation interface
         the interface operates on String data
         assign a lambda expression to it.This expression validates first name ,last name
         ,email id,password and phone number 
         **/
		
		Validation ref = (str) -> {
			Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
			Matcher m = p.matcher(str);
			boolean b = m.matches(); 
			
			return b;
		};
	 System.out.println("Validation of first name is " + ref.validateUserEntry("Subhashree"));
	
	 /*
	  * Lambada expression for lastname
	  */
	 Validation lastname = (str) -> {
				Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
				Matcher m = p.matcher(str);
				boolean b = m.matches(); 
				
				return b;
			};
	System.out.println("Validation of last name is " + lastname.validateUserEntry("Naik"));
	
	/*
	  * Lambda expression for email id
	  */
	Validation email = (str) -> {
					Pattern p = Pattern.compile("[a-z]{2,}(((.?)[+-]*(_?)*[a-z0-9]*){2,})*@[a-z]{1,}.[a-z]{1,}(.[a-z]*{1,})*");
					Matcher m = p.matcher(str);
					boolean b = m.matches(); 
					
					return b;
				};
	System.out.println("Validation of email id is " + email.validateUserEntry("subhashree.naik@gmail.com"));
	
	/*
	  * Lambda expression for password
	  */
	Validation password = (str) -> {
						Pattern p = Pattern.compile("(?=.*[A-Z]){1}(?=.*[0-9]){1}(?=.*[!@#$&*]){1}([A-Za-z0-9]).{5,}");
						Matcher m = p.matcher(str);
						boolean b = m.matches(); 
						
						return b;
					};
	System.out.println("Validation of password  is " + password.validateUserEntry("1Asubha@"));
	/*
	  * Lambda expression for phone number
	  */
	Validation phoneno = (str) -> {
							Pattern p = Pattern.compile("91 [0-9]{10}");
							Matcher m = p.matcher(str);
							boolean b = m.matches(); 
							
							return b;
						};
	System.out.println("Validation of phone number is " + phoneno.validateUserEntry("91 9437735345"));

	}

}
