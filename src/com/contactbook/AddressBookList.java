package com.contactbook;

import java.util.ArrayList;

public class AddressBookList {
	String userInputBookName;
	ArrayList<ContactBook> contact;

	public AddressBookList(String userInputBookName) {
		this.userInputBookName = userInputBookName;
		this.contact = new ArrayList<ContactBook>();
	}

	public String getUserInputBookName() {
		return userInputBookName;
	}

	public void setUserInputBookName(String userInputBookName) {
		this.userInputBookName = userInputBookName;
	}

	public ArrayList<ContactBook> getContact() {
		return contact;
	}

	public void setContact(ArrayList<ContactBook> contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Address Book name :- " + userInputBookName + "\n" + "Contacts :- " + contact;
	}
}

