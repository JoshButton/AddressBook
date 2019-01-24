/**
This is the AddressBook class. It contains all the methods for interacting with the "ArrayList" of "Contacts."
 The requirements did not ask for validation and being stuck for time on this week I have not included any.
 Though there is no validation of the input text I have made sure it is looking for the correct data in the object.
 I have also not caught any outOfBounds exceptions or incorrect returns that will arise when trying to search for non existent data.
 @author Joshua Button
 @version 0.1
 @date 16/01/2019
 @website www.joshuabutton.co.uk
 */

package addressbook;
import java.util.*;

public class AddressBook implements AddressBookInterface {

	ArrayList<addressbook.Contact> addressList=new ArrayList<>();
	addressbook.Contact searchResult;
	int index;
	String contactEmail;
	String contactName;
	String contactSurname;
	String contactPhone;

	@Override
	public addressbook.Contact getContact(String number) {
		Iterator<addressbook.Contact> itr=  addressList.iterator();
		index = 0;
		while(itr.hasNext()) {
			contactName = itr.next().getPhone();
			if (contactName.equalsIgnoreCase(number)) {
				searchResult = addressList.get(index);
				break;
			}
			index++;
		}
		return searchResult;
	}

	@Override
	public String list() { return addressList.toString().replace("[","").replace("]",""); }

	@Override
	public void add(addressbook.Contact c) { addressList.add(c); }

	@Override
	public void delete(String s) {
		Iterator<addressbook.Contact> itr=  addressList.iterator();
		while(itr.hasNext()){
			contactName = itr.next().getName();
			if(contactName.equalsIgnoreCase(s)){
				itr.remove();
				break;
			}
		}
	}

	@Override
	public addressbook.Contact search(String s) {
		Iterator<addressbook.Contact> itr=  addressList.iterator();
		index = 0;
		while(itr.hasNext()) {
			addressbook.Contact searchContact = itr.next();
			contactName = searchContact.getName();
			contactSurname = searchContact.getSurname();
			if (contactName.equalsIgnoreCase(s) || contactSurname.equalsIgnoreCase(s)) {
				searchResult = addressList.get(index);
				break;
			}
			index++;
		}
		return searchResult;
	}

	@Override
	public addressbook.Contact searchAll(String s) {
		Iterator<addressbook.Contact> itr=  addressList.iterator();
		index = 0;
		while(itr.hasNext()) {
			addressbook.Contact searchAllContact = itr.next();
			contactEmail = searchAllContact.getEmail();
			contactName = searchAllContact.getName();
			contactSurname = searchAllContact.getSurname();
			contactPhone = searchAllContact.getPhone();
			if (contactEmail.equalsIgnoreCase(s) || contactName.equalsIgnoreCase(s) || contactSurname.equalsIgnoreCase(s) || contactPhone.equalsIgnoreCase(s))  {
				break;
			}
			index++;
		}
		return addressList.get(index);
	}
}
