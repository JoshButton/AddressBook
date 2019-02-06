import java.util.Comparator;

public class Contact {
	private String name;
	private String surname;
	private String phone;
	private String email;
	
	public String toString() {
		return name + " " + surname + " ("+phone + ", "+ email +")"; 
	}
	public Contact(String name, String surname) {
		this.name=name;
		this.surname=surname;
	}
	public Contact(String name, String surname,String phone, String email) {
		this.name=name;
		this.surname=surname;
		this.phone=phone;
		this.email=email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}

	public static Comparator<Contact> contactNameComparator = new Comparator<Contact>() {

		public int compare(Contact c1, Contact c2) {
			int comp = c1.surname.compareTo(c2.surname);
			if(comp!=0)
				return comp;
			else
				return c1.name.compareTo(c2.name);
		}};

	public static Comparator<Contact> contactPhoneComparator = new Comparator<Contact>() {

		public int compare(Contact c1, Contact c2) {

			int phoneno1 = Integer.parseInt(c1.phone.substring(1));
			int phoneno2 = Integer.parseInt(c2.phone.substring(1));
			return phoneno1-phoneno2;
		}};
	
}
