package com.contactbook;

import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;

public class ContactBook {
	
	public static void contact() {
	   	 
	   	 System.out.println(" ADDRESS BOOK ");
	   	 ArrayList<String> cont = new ArrayList<String>();
	   	 cont.add(" FirstName: Veccha");
	   	 cont.add(" LastName: Jahnavi");
	   	 cont.add(" Address: Javvarapeta");
	   	 cont.add(" City: Machilipatnam");
	   	 cont.add(" State: Andhra Pradesh");
	   	 cont.add(" ZipCode: 520013");
	   	 cont.add(" Phone: 8143822307");
	   	 cont.add(" Email: sujayithimulkj30@gmail.com");
	   	 
	   	 
	   	 for(String phonebook:cont)
	   		 System.out.println(phonebook);
	   	 
	   	 System.out.println("Enter Name to Edit in Address Book");
	   	 System.out.println();
	   	 String newf="Sachin";
	   	 String newl="Tendulkar";
	   	 
	   	 
	   	 cont.set(0,"FirstName: "+newf);
	   	cont.set(1,"LastName: " +newl);
	   	 
	   	 
	   	 for(String phonebook:cont)
	   		 System.out.println(phonebook);
	    }
	    
	    public static void main(String[] args) {
	   	 contact();
	   	 
	    }
     }
