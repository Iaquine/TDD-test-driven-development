
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int size = 0;
	
	public Object isEmpty() {
		return size == 0;
	}
	
	public Object size() {
		return size;
	}
	
	public void push() {
		
		if (size == 2) {
			throw new IllegalArgumentException("capacity overflow error");
		}
		size += 1;
	   
	}
	
	public void pop() { 
		
		if (size == 0) {
			throw new IllegalArgumentException("capacity underflow error");
		}
		
		size -= 1;
	}
	
	
}
