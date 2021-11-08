
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(String string) {
		
		boolean Palindrome = true;  
		

		String firstchar = string;
        int length = firstchar.length();
         
        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(firstchar.charAt(beginIndex) != firstchar.charAt(length-1-beginIndex)) {
                System.out.println("String is not a palindrome.");
                Palindrome = false;
                break;
            }
        }
		
		
		
		return Palindrome;
	}



}
