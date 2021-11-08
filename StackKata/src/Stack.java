
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
		return null;
	}

}
