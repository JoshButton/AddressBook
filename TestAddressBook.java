/**
 This project shows the use of Arraylist to store objects
 The requirements did not ask for validation and being stuck for time on this week I have not included any.
 Though there is no validation of the input text I have made sure it is looking for the correct data in the object.
 I have also not caught any outOfBounds exceptions or incorrect returns that will arise when trying to search for non existent data.
 0.2 update adds sorting.
 @author Joshua Button
 @version 0.2
 @date 04/02/2019
 @website www.joshuabutton.co.uk
 */

public class TestAddressBook {

    public static void main(String[] args) {
        AddressBookInterface addressBook = new AddressBook();
        Contact a = new Contact("Homer", "Simpson", "+158623496", "homer@fox.com");
        Contact c = new Contact("Peter", "Griffin", "+152343496", "peter@fox.com");
        Contact b = new Contact("James", "Griffin", "+152343497", "james@fox.com");
        Contact d = new Contact("Walter", "White", "+117323496", "heisenberg@gmail.com");
        Contact e = new Contact("Sheldon", "Cooper", "+123423496", "cooper@caltech.edu");
        addressBook.add(a);addressBook.add(c);addressBook.add(d);addressBook.add(e);addressBook.add(b);

        System.out.println("print \"a\": ");
        System.out.println(a);
        System.out.println("-----");
        System.out.println("print \"addressBook.list()\": ");
        System.out.println(addressBook.list());
        System.out.println("-----");
        System.out.println("addressBook.delete(\"Sheldon\")");
        addressBook.delete("Sheldon");
        System.out.println("-----");
        System.out.println("print \"addressBook.list()\": ");
        System.out.println(addressBook.list());
        System.out.println("-----");
        System.out.println("print \"addressBook.search(\"Peter\")\": ");
        System.out.println(addressBook.search("Peter"));
        System.out.println("-----");
        System.out.println("print \"addressBook.searchAll(\"homer@fox.com\")\": ");
        System.out.println(addressBook.searchAll("homer@fox.com"));
        System.out.println("-----");
        System.out.println("print \"addressBook.getContact(\"+15111\")\": ");
        System.out.println(addressBook.getContact("+15111"));
        System.out.println("-----");
        System.out.println("print \"addressBook.list()\": ");
        System.out.println(addressBook.list());
        System.out.println("-----");
        System.out.println("print \"addressBook.sortNamesAlphabetically()\": ");
        System.out.println(((AddressBook) addressBook).sortNamesAlphabetically());
        System.out.println("-----");
        System.out.println("print \"addressBook.sortNumbersNumerically()\": ");
        System.out.println(((AddressBook) addressBook).sortNumbersNumerically());
        System.out.println("-----");
        System.out.println("End");

    }

}
