
public class Contact {
	
	// Private variables
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	

	
	// constructor
	
	/*
	 * the isBlank() method checks to see if the field was left empty or just uses white space as in
	 * someone just adding spaces.
	 */
	public Contact(String id, String fname, String lname, String phoneNum,
			String contactAddress) throws IllegalArgumentException {
	
		//validate ID if passed through constructor
		if (id.isBlank() || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		} else {
			this.contactID = id;
		}
	
		//validate first Name if passed through constructor
		if (fname.isBlank() || fname.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		} else {
			this.firstName = fname;
		}
		
		
		//validate first Name if passed through constructor
		if (lname.isBlank() || lname.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		} else {
			this.lastName = lname;
		}
		
		//validate first Name if passed through constructor
		if (phoneNum.isBlank() || phoneNum.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		} else {
			this.phone = phoneNum;
		}
		
		//validate first Name if passed through constructor
		if (contactAddress.isBlank() || contactAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		} else {
			this.address = contactAddress;
		}
				
	}
	
	//setters
	
	public void setFirstName(String fname) {
		
		//validate first Name and set it if passes
		if (fname.isBlank() || fname.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		} else {
			this.firstName = fname;
		}
	}
	
	public void setLastName(String lname) {
		
		//validate first Name and set it if passes
		if (lname.isBlank() || lname.length() > 10) {
			throw new IllegalArgumentException("Invalid Name");
		} else {
			this.lastName = lname;
		}
	}
	
	public void setPhone(String phoneNum) {
		
		//validate first Name and set it if passes
		if (phoneNum.isBlank() || phoneNum.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		} else {
			this.phone = phoneNum;
		}
	}
	
	public void setAddress(String contactAddress) {
		
		//validate first Name and set it if passes
		if (contactAddress.isBlank() || contactAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		} else {
			this.address = contactAddress;
		}
	}
	
	//Getters
	
	public String getContactID() {
		return this.contactID;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	
	
	
	
	
	

}
