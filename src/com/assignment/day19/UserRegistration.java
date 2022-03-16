package com.assignment.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	    
	    static String[] validemail = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
	    static String[] invalidemail = {"abc", "abc@.com.my","abc123@gmail.a", "abc123@.com",
	            "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
	            "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
	            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
	
	    /* Method to check validation of First and last name
	     *  where regular expression of first and last name is defined */
public boolean validForName(String firstname) 
	    {
		Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		Matcher m = p.matcher(firstname);
		boolean b = m.matches(); 
		return b;
	    }
	   /* Method to check validation of EmailId
	    *  where regular expression of emailId is defined */
public  boolean validEmailId(String s) {
		
		Pattern p = Pattern.compile("[a-z]{2,}(((.?)[+-]*(_?)*[a-z0-9]*){2,})*@[a-z]{1,}.[a-z]{1,}(.[a-z]*{1,})*");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }
/* Method to check validation of mobile Number
 *  where regular expression of 10 digit mobile number is defined */
 public  boolean validMobileNo(String s) {
		
		Pattern p = Pattern.compile("91 [0-9]{10}");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
	    }
 /* Method to check validation of password
  * with at least one number,one upper case letter and has exactly one special character  
  * of regex is defined */
 public  boolean validPassword(String s) {
		Pattern p = Pattern.compile("(?=.*[A-Z]){1}(?=.*[0-9]){1}(?=.*[!@#$&*]){1}([A-Za-z0-9]).{5,}");
		Matcher m = p.matcher(s);
		boolean b = m.matches(); 
		
		return b;
		
		}
 /* Method to check validation of email id with sample of multiple email id */
 public  void sampleEmailvalidation() {
	 for(int i=0;i<validemail.length;i++) {
			boolean check = Pattern.matches("^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*[@][a-zA-Z0-9]+.[a-zA-Z]{2,}([.][a-z]{2,})?$", validemail[i]); 
			System.out.println(check);
		}
 }

 public  void sampleEmailInvalidation() {
	 for(int i=0;i<invalidemail.length;i++) {
			boolean check = Pattern.matches("^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,}([.][a-z]{2,})?$", invalidemail[i]); 
			System.out.println(check);
		}
 }
	
	 
}
