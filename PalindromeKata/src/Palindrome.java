
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(Object string) {
		
		boolean Palindrome = true;  
		
		 if (!(string instanceof String)) {
	        	System.out.println("here");
	            throw new IllegalArgumentException("Only strings are allowed");
	            
	        }

		String firstchar = (String) string;
        int length = firstchar.length();
         
        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(firstchar.charAt(beginIndex) != firstchar.charAt(length-1-beginIndex)) {
                Palindrome = false;
                break;
            }
        }
		
        if (string.equals("")) {
            throw new IllegalArgumentException("Empty string are not allowed");
        }
        
       
        
		return Palindrome;
	}



}
