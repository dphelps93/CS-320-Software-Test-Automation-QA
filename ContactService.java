import java.util.HashMap;


/*
 * The use of a hash map to store contacts allows for fast searching when updating or searching
 * for a contact using the id
 * 
 *Source used for hashmap https://www.geeksforgeeks.org/hashmap-containskey-method-in-java/
 *
 *https://www.geeksforgeeks.org/hashtable-remove-method-in-java/#:~:text=remove()%20is%20an%20inbuilt,particular%20key%20in%20the%20Table.&text=Parameters%3A%20The%20method%20takes%20one,be%20removed%20from%20the%20Table.
 */

public class ContactService {
	
	// sets a unique id that is not able to be updated
	int ID = 0;
	HashMap<String, Contact> contactList = new HashMap<String,Contact>();
	
	//Add contact to hashmap
	public void addContact(String fname, String lname, String phoneNum, String contactAddress) {
		++ID;
		String uniqueID = Integer.toString(ID);
		
		Contact newContact = new Contact(uniqueID,fname,lname,phoneNum,contactAddress);
		contactList.put(newContact.getContactID(), newContact);
	}
	
	//delete contact from contact list
	
	/*
	 * using containsKey() function searches the hashmap for a value that matches that key.
	 * We can then us that key to remove and update contacts.
	 */
	public void deleteContact(String ID) {
		
		if (contactList.containsKey(ID)) {
			contactList.remove(ID);
		}
	}
	
	//update first name
	public void updateFirstName(String ID, String newFName) {
		
		if (contactList.containsKey(ID)){
			contactList.get(ID).setFirstName(newFName);
		}
	}
	
	//update last name
	public void updateLastName(String ID, String newLName) {
		
		if (contactList.containsKey(ID)){
			contactList.get(ID).setLastName(newLName);
		}
	}
	
	//update phone number
	
	public void updatePhone(String ID, String newPhone) {
		
		if (contactList.containsKey(ID)){
			contactList.get(ID).setPhone(newPhone);
		}
	}
	
	//update address
	public void updateAddress(String ID, String newAddress) {
		
		if (contactList.containsKey(ID)){
			contactList.get(ID).setAddress(newAddress);
		}
	}
	
	
	
	
}
