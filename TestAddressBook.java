/**
 This contains a bunch of test commands to test each of the methods in "AddressBook."
 @author Joshua Button
 @version 0.1
 @date 16/01/2019
 @website www.joshuabutton.co.uk
 */

package addressbook;

public class TestAddressBook {

	public static void main(String[] args) {
		AddressBookInterface b = new AddressBook();
		Contact a = new Contact("Homer", "Simpson", "+158623496", "homer@fox.com");
		Contact c = new Contact("Peter", "Griffin", "+1588888", "peter@fox.com");
		Contact d = new Contact("Walter", "White", "+15111", "heisenberg@gmail.com");
		Contact e = new Contact("Sheldon", "Cooper", "+14444", "cooper@caltech.edu");
		b.add(a);b.add(c);b.add(d);b.add(e);

		System.out.println("print \"a\": ");
		System.out.println(a);
		System.out.println("-----");
		System.out.println("print \"b.list()\": ");
		System.out.println(b.list());
		System.out.println("-----");
		System.out.println("b.delete(\"Sheldon\")");
		b.delete("Sheldon");
		System.out.println("-----");
		System.out.println("print \"b.list()\": ");
		System.out.println(b.list());
		System.out.println("-----");
		System.out.println("print \"b.search(\"Peter\")\": ");
		System.out.println(b.search("Peter"));
		System.out.println("-----");
		System.out.println("print \"b.searchAll(\"homer@fox.com\")\": ");
		System.out.println(b.searchAll("homer@fox.com"));
		System.out.println("-----");
		System.out.println("print \"b.getContact(\"+15111\")\": ");
		System.out.println(b.getContact("+15111"));
		System.out.println("-----");
		System.out.println("End");
		
	}

}
