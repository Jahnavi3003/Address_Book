package com.contactbook;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class NewContact {
	static Scanner input = new Scanner(System.in);
	static ArrayList<AddressBookList> addressBookNameList = new ArrayList<>();

	
	public void addContact() {

		if (addressBookNameList.isEmpty()) {
			System.out.println("\nPlease add Address book to add contacts.");
			return;
		} else {
			System.out.println("Enter address book name in which you want to add contacts :- ");
			String enter = input.next();

			System.out.print("\nEnter First Name:- ");
			String first = input.next();

			System.out.print("Enter Last Name:- ");
			String last = input.next();

			System.out.print("Enter Address:- ");
			String add = input.next();

			System.out.print("Enter City:- ");
			String city = input.next();

			System.out.print("Enter State:- ");
			String state = input.next();

			System.out.print("Enter Zip Code:- ");
			int zip = input.nextInt();

			System.out.print("Enter Phone Number:- ");
			long phone = input.nextLong();

			System.out.print("Enter E-mail:- ");
			String email = input.next();

			ContactBook contact = new ContactBook(first, last, add, city, state, zip, phone, email);

			if (duplicateCheck(enter , first)) {
				addressBookNameList.stream().filter(find -> find.userInputBookName.contains(enter))
						.forEach(addressBook -> addressBook.contact.add(contact));
	
				System.out.println("\nContact added Successfully.\n");
			}
			else {
				System.out.println("\nYou have already this person in your contact list.\n");
				return;
			}

		}
	}

	public boolean duplicateCheck(String enter , String first) {
		for (AddressBookList addressBook : addressBookNameList) {
			if (enter.equals(addressBook.userInputBookName)) {
				for (ContactBook person : addressBook.contact) {
					if (first.equals(person.getFirstName())) {
						return false;
					}
					else {
						continue;
					}
				}
			}
			else {
				continue;
			}
		}
		return true;
	}

	public void editContact() {

		System.out.println("Enter address book name in which you want to edit contacts :- ");
		String enter = input.next();
		System.out.println("\nEnter first name to edit :- ");
		String name = input.next();
		for (AddressBookList addressBook : addressBookNameList) {
			if (enter.equals(addressBook.userInputBookName)) {
				for (ContactBook person : addressBook.contact) {
					if (name.equals(person.getFirstName())) {
						System.out
								.print("\nSelect option to edit..." + " 1.First_name." + " 2.Last_name." + " 3.Address."
										+ " 4.City" + " 5.State" + " 6.Zip_code" + " 7.Phone_number" + " 8.Email :- ");
						int option = input.nextInt();
						switch (option) {
						case 1:
							System.out.print("Enter new first name :- ");
							String newFirstName = input.next();
							person.setFirstName(newFirstName);
							System.out.println("First name is updated.");
							break;

						case 2:
							System.out.print("Enter new last name :- ");
							String newLastName = input.next();
							person.setLastName(newLastName);
							System.out.println("Last name is updated.");
							break;

						case 3:
							System.out.print("Enter new Address :- ");
							String newAddress = input.next();
							person.setAddress(newAddress);
							System.out.println("Address is updated.");
							break;

						case 4:
							System.out.print("Enter new city name :- ");
							String newCity = input.next();
							person.setCity(newCity);
							System.out.println("City is updated.");
							break;

						case 5:
							System.out.print("Enter new state name :- ");
							String newState = input.next();
							person.setState(newState);
							System.out.println("State is updated.");
							break;

						case 6:
							System.out.print("Enter new Zip code :- ");
							int newZip = input.nextInt();
							person.setZip(newZip);
							System.out.println("Zip code is updated.");
							break;

						case 7:
							System.out.print("Enter new phonr number :- ");
							long newPhone = input.nextLong();
							person.setPhoneNumber(newPhone);
							System.out.println("Phone number is updated.");
							break;

						case 8:
							System.out.print("Enter new email :- ");
							String newEmail = input.next();
							person.setEmail(newEmail);
							System.out.println("Email is updated.");
							break;

						default:
							System.out.println("Please enter a number between 1 to 8 only...");

						}
					} else {
						continue;
					}
				}
			} else {
				continue;
			}
		}
	}

	
	public void deleteContact() {
		System.out.println("Enter address book name in which you want to delete contacts :- ");
		String enter = input.next();

		System.out.print("Enter first name to delete contact:- ");
		String deleteByName = input.next();

		for (AddressBookList addressBook : addressBookNameList) {
			if (enter.equals(addressBook.userInputBookName)) {
				for (ContactBook person : addressBook.contact) {
					if (deleteByName.equals(person.getFirstName())) {
						addressBook.contact.remove(person);
						System.out.println("\nSelected contact deleted successfully.");
						break;
					} else {
						continue;
					}
				}
			} else {
				continue;
			}
		}
	}

	
	public void addMultiplePersons() {
		System.out.println("Enter how many contacts you want to add :- ");
		int userWant = input.nextInt();
		for (int i = 1; i <= userWant; i++) {
			addContact();
		}
	}

	
	public void newAddressBook() {
		
		System.out.println("Enter Address Book Name :- ");
		String userInputBookName = input.next();
		
		if(!checkUnique(userInputBookName)) {
			System.out.println("OOPS! You aleady have AddressBook with same name.\n");
			return;
		}
		
		AddressBookList addressBookObj = new AddressBookList(userInputBookName);
		addressBookNameList.add(addressBookObj);

		System.out.println("New Address Book Name is added to list.");
	}

	
	public boolean checkUnique(String userInputBookName) {
		if(addressBookNameList.isEmpty()) {
			return true;
		}
		for(int i = 0; i < addressBookNameList.size(); i++) {
			String getName = addressBookNameList.get(i).userInputBookName;
			if(getName.equals(userInputBookName)) {
				return false;
			}
		}
		return true;
	}
	
	
	public void displayAddressBook() {
		for (AddressBookList addressBook : addressBookNameList) {
			System.out.println(addressBook);
		}
	}

	
public void searchPersonByCity() {
		
		System.out.print("\nEnter city to search person by city name :- ");
		String searchCity = input.next();
		
		for (AddressBookList addressBook : addressBookNameList) {
			for (ContactBook person : addressBook.contact) {
				if (searchCity.equals(person.getCity())) {
					System.out.println("Persons who are in same city " + "(" + searchCity + ") :- " + person.getFirstName());
				} else {
					continue;
				}
			}
		}
	}
	
	public void searchPersonByState() {
		
		System.out.print("\nEnter State to search person by city name :- ");
		String searchState = input.next();
		
		for (AddressBookList addressBook : addressBookNameList) {
			for (ContactBook person : addressBook.contact) {
				if (searchState.equals(person.getState())) {
					System.out.println("Persons who are in same state " + "(" + searchState + ") :- " + person.getFirstName());
				} else {
					continue;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("--------------------Welcome To Address Book Program-----------------------");
		NewContact obj = new NewContact();

		System.out.print("Enter valid option to perform Address Book Application[1.Enter (or) 2.Exit] :- ");
		int enterExit = input.nextInt();
		if (enterExit == 1) {

			while (enterExit != 2) {
				System.out.println("Choose which operation you want to perform from below list :- ");
				System.out.println("1.Add Contact.");
				System.out.println("2.Edit Contact");
				System.out.println("3.Delete Contact.");
				System.out.println("4.Add new address book.");
				System.out.println("5.Display Address Book");
				System.out.println("6.Exit from the Application");

				System.out.println("\nEnter your choice :- ");
				int userChoice = input.nextInt();

				switch (userChoice) {
				case 1:
					obj.addMultiplePersons();
					break;
				case 2:
					obj.editContact();
					break;
				case 3:
					obj.deleteContact();
					break;
				case 4:
					obj.newAddressBook();
					break;
				case 5:
					obj.displayAddressBook();
					break;
				default:
					System.out.println("Enter valid choice from the list...");
				}
				if (userChoice == 6) {
					System.out.println("Successfully exited from the Address Book Application.");
					break;
				}
			}
		} else if (enterExit == 2) {
			System.out.println("Successfully exited from the Address Book Application.");
		} else {
			System.out.println("Choose Valid option [1.Enter (or) 2.Exit]...");
		}
	}
}