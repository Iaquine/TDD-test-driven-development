
public class Stack {

	
	
	
	int size = 0;
	int capacity = 0;
	String [] element = new String[2];
	
	
	public Stack(int capacity) {
		
		if (capacity < 1) {
			throw new IllegalArgumentException("invalid capacity");
		}
		
		this.capacity = capacity;
		
	}

	public Object isEmpty() {
		return size == 0;
	}
	
	public Object size() {
		return size;
	}
	
	public void push(String item) {
		
		if (size == 2) {
			throw new IllegalArgumentException("capacity overflow error");
		}
		element[size] = item;
		size += 1;
	   
	}
	
	public String pop() { 
		
		if (size == 0) {
			throw new IllegalArgumentException("capacity underflow error");
		}
		
		size -= 1;
		return element[size];
	}
	
	
}
