import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeTest {

	Palindrome pan = new Palindrome();
	
	@Nested
	@DisplayName("Tests if a word is a palindrome")
	class isPalindrome {
		
		@Test
		@DisplayName("true for mom")
		void trueForMom() {
			assertTrue(pan.isPalindrome("mom"),true);
		}
		
		@Test
		@DisplayName("false for dude")
		void falseFordude() {
			assertTrue(pan.isPalindrome("dude"),false);
		}
		
		@Test
		@DisplayName("true for mom mom")
		void trueFormomMom() {
			assertTrue(pan.isPalindrome("mom mom"),true);
		}
		
		@Test
		@DisplayName("false for dad mom")
		void falseFordadMom() {
			assertTrue(pan.isPalindrome("dad mom"),false);
		}
		
		@Test
		@DisplayName("true for whitespace")
		void trueForwhitespace() {
			assertTrue(pan.isPalindrome(),true);
		}
		
		@Test
		@DisplayName("error for empty string")
		void errorForemptyString() {
			
			NullPointerException exception = assertThrows(NullPointerException.class, 
					() -> {pan.isPalindrome("");
						});
	    assertEquals("Empty string are not allowed", exception.getMessage());
		}
		
		@Test
		@DisplayName("error for not a string")
		void errorFornotString() {
			assertTrue(pan.isPalindrome(" "),true);
			
			IllegalArgumentException thrown = Assertions
					.assertThrows(IllegalArgumentException.class, 
							() -> {pan.isPalindrome("");
							});		
		
			assertEquals("Only strings are allowed", thrown.getMessage());
		}
	}
}
