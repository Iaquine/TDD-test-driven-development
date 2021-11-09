import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
		   stack.push();
		   assertEquals(false, stack.isEmpty());
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
	
		@Test
		@DisplayName("throws overflow error when pushing to a stack at full capacity")
		void throwsOverflowerrorWhenpushStackfullCapacity() {
			IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, 
					() -> {	stack.push();
							stack.push();
							stack.push();
					});		
                   assertEquals("capacity overflow error", thrown.getMessage());
			
		}
		
		@Test
		@DisplayName("throw underflow error when popping an empty stack")
		void throwUnderflowerrorWhenpoppingEmptystack() {
			IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, 
					() -> {	stack.pop();
					});		
                   assertEquals("capacity underflow error", thrown.getMessage());
			
		}
		
		
	}

}
