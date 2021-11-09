
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int size = 0;
	boolean empty = true;
	
	public Object isEmpty() {
		return empty;
	}


	public Object size() {
		
		if (empty == true) {
			return size = 0;
		}
		return size;
	}
	
	public Object push() {
		size =+1;
		return empty = false;
	  
	}

	public void pop() {
		
		empty = true;	 
		size =- 1;
	}
}
