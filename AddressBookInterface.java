package addressbook;

public interface AddressBookInterface {

	Contact getContact(String number);

	String list();

	void add(Contact c);

	void delete(String s);

	Contact search(String s);

	Contact searchAll(String s);

	void print();

}