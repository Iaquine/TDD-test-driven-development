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
			assertEquals(true, stack.isEmpty());
		}
		@Test
		@DisplayName("starts with stack size of 0")
		void startsWithstackSizeof0() {
			assertEquals(0, stack.size());
		}
		
		@Test
		@DisplayName("is not empty when pushed")
		void isNotemptyWhenpushed() {
			assertEquals(false, stack.push());
		}
		
		@Test
		@DisplayName("stack size is 1 when pushed'")
		void stackSizeis1Whenpushed() {
			stack.push();
			assertEquals(1, stack.size());
		}
		
		@Test
		@DisplayName("stack is empty when pushed and popped")
		void stackIsemptyWhenpushedAndpopped() {
			stack.push();
			stack.pop();
			assertEquals(true, stack.isEmpty());
		}
		
		@Test
		@DisplayName("stack size is 0 when pushed and popped")
		void stackSizeis0WhenpushedAndpopped() {
			stack.push();
			stack.pop();
			assertEquals(0, stack.size());
		}
	
	
	}

}
