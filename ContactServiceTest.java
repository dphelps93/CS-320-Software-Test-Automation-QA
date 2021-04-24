import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	//test the ability to add contacts
	@Test
	void testAddContact() {
		ContactService contactLists = new ContactService();
		contactLists.addContact("Jane", "Doe", "1234567890", "1520 North Test Ave");
		
		assertTrue(contactLists.contactList.containsKey("1"));
	}
	
	//test that all contacts contain a unique id
	@Test
	void testUniqueID() {
		ContactService contactLists = new ContactService();
		contactLists.addContact("Jane", "Doe", "1234567890", "1520 North Test Ave");
		contactLists.addContact("Jake", "Doe", "1234567891", "1521 North Test Ave");
		contactLists.addContact("John", "Doe", "1234567892", "1522 North Test Ave");
		contactLists.addContact("Jose", "Doe", "1234567893", "1523 North Test Ave");
		
		// in small data sets it is necessary to check all possible outcomes if applicable.
		assertNotEquals(contactLists.contactList.get("1").getContactID(), contactLists.contactList.get("2").getContactID());
		assertNotEquals(contactLists.contactList.get("2").getContactID(), contactLists.contactList.get("3").getContactID());
		assertNotEquals(contactLists.contactList.get("1").getContactID(), contactLists.contactList.get("3").getContactID());
		assertNotEquals(contactLists.contactList.get("1").getContactID(), contactLists.contactList.get("4").getContactID());
		assertNotEquals(contactLists.contactList.get("4").getContactID(), contactLists.contactList.get("3").getContactID());
		assertNotEquals(contactLists.contactList.get("2").getContactID(), contactLists.contactList.get("4").getContactID());
	}
	
	//test ability to delete contact
	@Test
	void testDeleteContact() {
		ContactService contactLists = new ContactService();
		contactLists.addContact("Jane", "Doe", "1234567890", "1520 North Test Ave");
		contactLists.addContact("Jake", "Doe", "1234567891", "1521 North Test Ave");
		contactLists.addContact("John", "Doe", "1234567892", "1522 North Test Ave");
		contactLists.deleteContact("3");
		
		assertFalse(contactLists.contactList.containsKey("3"));
	}
	
	//test the ability to update first name
	@Test
	void testUpdateFirstName() {
		ContactService contactLists = new ContactService();
		contactLists.addContact("Jane", "Doe", "1234567890", "1520 North Test Ave");
		contactLists.addContact("Jake", "Doe", "1234567891", "1521 North Test Ave");
		contactLists.addContact("John", "Doe", "1234567892", "1522 North Test Ave");
		contactLists.updateFirstName("2", "Jake");
		
		assertEquals("Jake",contactLists.contactList.get("2").getFirstName());
	}
	
	//test the ability to update last name
	@Test
	void testUpdateLastName() {
		ContactService contactLists = new ContactService();
		contactLists.addContact("Jane", "Doe", "1234567890", "1520 North Test Ave");
		contactLists.addContact("Jake", "Goose", "1234567891", "1521 North Test Ave");
		contactLists.addContact("John", "Doe", "1234567892", "1522 North Test Ave");
		contactLists.updateFirstName("2", "Goose");
		
		assertEquals("Goose",contactLists.contactList.get("2").getLastName());
	}
	
	//test the ability to update phone
	@Test
	void testUpdatePhone() {
		ContactService contactLists = new ContactService();
		contactLists.addContact("Jane", "Doe", "1234567890", "1520 North Test Ave");
		contactLists.addContact("Jake", "Doe", "1234567894", "1521 North Test Ave");
		contactLists.addContact("John", "Doe", "1234567892", "1522 North Test Ave");
		contactLists.updatePhone("3", "1234567894");
		
		assertEquals("1234567894",contactLists.contactList.get("2").getPhone());
	}
	
	//test ability to update address
	@Test
	void testUpdateAddress() {
		ContactService contactLists = new ContactService();
		contactLists.addContact("Jane", "Doe", "1234567890", "1520 North Test Ave");
		contactLists.addContact("Jake", "Doe", "1234567891", "1521 North Test Ave");
		contactLists.addContact("John", "Doe", "1234567892", "1522 North Test Ave");
		contactLists.updateAddress("2", "1527 South Test Ave");
		
		assertEquals("1527 South Test Ave",contactLists.contactList.get("2").getAddress());
	}

}
