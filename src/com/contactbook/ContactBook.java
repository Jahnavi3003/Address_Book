package com.contactbook;

import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;

public class ContactBook {
	
     public static void contact() {
    	 
    	 System.out.println(" ADDRESS BOOK ");
    	 ArrayList<String> cont = new ArrayList<String>();
    	 cont.add(" FirstName: ");
    	 cont.add(" LastName: ");
    	 cont.add(" Address: ");
    	 cont.add(" City: ");
    	 cont.add(" State: ");
    	 cont.add(" ZipCode: ");
    	 cont.add(" Phone: ");
    	 cont.add(" Email: ");
    	 
    	 for(String phonebook:cont)
    		 System.out.println(phonebook);
    	 
    	 Scanner c = new Scanner(System.in);
		  
		  System.out.println("Enter new Contact Information ");
		  System.out.println("Enter your First Name :");
		  String s1 = c.next();
		  System.out.println("Enter your Last Name :");
		  String s2 = c.next();
		  System.out.println("Enter your Address :");
		  String s3 = c.next();
		  System.out.println("Enter your City :");
		  String s4 = c.next();
		  System.out.println("Enter your State :");
		  String s5 = c.next();
		  System.out.println("Enter your ZipCode :");
		  Double s6 = c.nextDouble();
		  System.out.println("Enter your Phone :");
		  Long s7 = c.nextLong();
		  System.out.println("Enter your Email :");
		  String s8 = c.next();
     }
     
     public static void main(String[] args) {
    	 contact();
    	 System.out.println("New Contact Added Successfully");
    	 
     }
}
