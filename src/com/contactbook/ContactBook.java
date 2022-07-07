package com.contactbook;

import java.util.ArrayList;

public class ContactBook {
	
     public static void contact() {
    	 
    	 System.out.println(" ADDRESS BOOK CREATED");
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
     }
     
     public static void main(String[] args) {
    	 contact();
    	 
     }
}
