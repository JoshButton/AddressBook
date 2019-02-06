# AddressBook
UEL - 2nd Year Computer Science - Data Structures and Algorithms CN5121

<h3>BRIEF</h3>
Design a Java program to store an Address Book. The address book contains many contacts; a contact contains: name, surname, phone number, email of a person.<br>
The package addressbook contains the empty class AddressBook: you have to implement the methods and use and extend the main method in the TestAddressBook class to test your code.<br>
An object AddressBook has a name, and it is possible to add new contact given the contacts data. The method getContact() receive a number and returns the Contact object.<br>
The method add(Contact c) allows adding an object Contact to the Address Book, while the method delete(String s) will delete the Contact with surname equal to s.<br>
The method list() returns a string with a comma-separated list of the contacts.<br>
The method search(String s) returns the first Contact containing the string s in name or surname fields.<br>
The method searchAll(String s) returns the first Contact containing the string s in any of the contacts' fields.<br>

<h3>IMPLEMENTATION</h3>
Contact objects are stored in an ArrayList where they can be put through an iterator to search for the required data<br>
The requirements did not ask for validation and being stuck for time on this week I have not included any.<br>
Though there is no validation of the input text I have made sure the AddressBook class is looking for the correct attribute in the Contact object.<br>
I have also not caught any outOfBounds exceptions or incorrect returns that will arise when trying to search for non existent data. <br>


<h3>Sorting update - Week 3</h3>
Added sorting to the address book using comparator