
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Object isEmpty() {
		return true;
	}

	public Object size() {
		
		boolean isEmpty = (boolean) isEmpty();
		
		if (isEmpty == true) {
			int size = 0;
			return size;
		}
		return false;
	}

	public Object push(int item) {
		int size =+ 1;
		boolean empty = (boolean) isEmpty();
		empty = false;
		
		return empty;	
	  
	}

}
