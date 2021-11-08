import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class StackTest {

	Stack stack = new Stack();  
	
	
	@Nested
	@DisplayName("Tests if it can build a stack")
	class stackFactory {
		
		@Test
		@DisplayName("starts empty")
		void startsEmpty() {
			assertEquals(stack.isEmpty(),true);
		}
	
	
	
	
	
	
	}

}
