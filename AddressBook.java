import java.util.*;

public class AddressBook implements AddressBookInterface {

	ArrayList<Contact> addressList=new ArrayList<>();
	Contact searchResult;
	int index;
	String contactEmail;
	String contactName;
	String contactSurname;
	String contactPhone;

	@Override
	public Contact getContact(String number) {
		Iterator<Contact> itr=  addressList.iterator();
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
	public void add(Contact c) { addressList.add(c); }

	@Override
	public void delete(String s) {
		Iterator<Contact> itr=  addressList.iterator();
		while(itr.hasNext()){
			contactName = itr.next().getName();
			if(contactName.equalsIgnoreCase(s)){
				itr.remove();
				break;
			}
		}
	}

	@Override
	public Contact search(String s) {
		Iterator<Contact> itr=  addressList.iterator();
		index = 0;
		while(itr.hasNext()) {
			Contact searchContact = itr.next();
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
	public Contact searchAll(String s) {
		Iterator<Contact> itr=  addressList.iterator();
		index = 0;
		while(itr.hasNext()) {
			Contact searchAllContact = itr.next();
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

	@Override
	public void print() {

	}


	String sortNamesAlphabetically() {
		Collections.sort(addressList, Contact.contactNameComparator);
		return addressList.toString().replace("[","").replace("]","");
	}

	String sortNumbersNumerically() {
		Collections.sort(addressList, Contact.contactPhoneComparator);
		return addressList.toString().replace("[","").replace("]","");
	}
}
