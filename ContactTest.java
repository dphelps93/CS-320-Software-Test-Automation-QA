

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	//ID requirements
	
	//test a valid ID
	@Test
	void validIDTest() {
		Contact newContact = new Contact("1", "Jane", "Doe", "1234567890", "North Test Avenue" );
		assertTrue(newContact.getContactID().equals("1"));
	}
	
	//test an invalid ID with more than 10 Chars
	@Test
	void testInvalidIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact newContact = new Contact("12345678901", "Jane", "Doe", "1234567890", "North Test Avenue" );
		});
	}
	
	//test null id
	@Test
	void testInvalidIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact newContact = new Contact("", "Jane", "Doe", "1234567890", "North Test Avenue" );
		});
	}
	
	//First Name Requirements
	
	//Valid First Name
	@Test
	void testValidFirstName() {
		Contact newContact = new Contact("1", "Jane", "Doe", "1234567890", "North Test Avenue" );
		assertTrue(newContact.getFirstName().equals("Jane"));
		}
	
	//test first name too long
	@Test
	void testInvalidFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact newContact = new Contact("11", "JaneandJohnny", "Doe", "1234567890", "North Test Avenue" );
		});
	}
	
	//test first name null
	@Test
	void testInvalidFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact newContact = new Contact("11", "", "Doe", "1234567890", "North Test Avenue" );
		});
	}
	
	//Last Name Requirements
	
		//Valid Last Name
		@Test
		void testValidLastName() {
			Contact newContact = new Contact("1", "Jane", "Doe", "1234567890", "North Test Avenue" );
			assertTrue(newContact.getLastName().equals("Doe"));
			}
		
		//test Last name too long
		@Test
		void testInvalidLastNameTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				Contact newContact = new Contact("11", "Jane", "Doenameistoolong", "1234567890", "North Test Avenue" );
			});
		}
		
		//test Last name null
		@Test
		void testInvalidLastNameNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				Contact newContact = new Contact("11", "Jane", "" , "1234567890", "North Test Avenue" );
			});
		}
		
	//Phone number requirements
		
		//Valid phone number
		@Test
		void testValidPhone() {
			Contact newContact = new Contact("1", "Jane", "Doe", "1234567890", "North Test Avenue" );
			assertTrue(newContact.getPhone().equals("1234567890"));
			}
		
		//test Phone too long
		@Test
		void testInvalidPhoneTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				Contact newContact = new Contact("11", "Jane", "Doe", "12345678901", "North Test Avenue" );
			});
		}
		
		//test Phone Too Short
		void testInvalidPhoneTooShort() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				Contact newContact = new Contact("11", "Jane", "Doe", "123456789", "North Test Avenue");
			});
		}
		
		//test Phone null
		@Test
		void testInvalidPhoneNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				Contact newContact = new Contact("11", "Jane", "Doe", "", "North Test Avenue" );
			});
		}
		
		//Address Requirements
		
		//Valid Address
		@Test
		void testValidAddress() {
			Contact newContact = new Contact("1", "Jane", "Doe", "1234567890", "North Test Avenue" );
			assertTrue(newContact.getAddress().equals("North Test Avenue"));
			}
			
		//test Address too long
		@Test
		void testInvalidAddressTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				Contact newContact = new Contact("11", "Jane", "Doe", "1234567890", "North Test Avenue This Address is now going to be too Long" );
			});
		}
		
		//test Address null
		@Test
		void testInvalidAddressNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				Contact newContact = new Contact("11", "Jane", "Doe", "1234567890", "" );
			});
		}
}
	


