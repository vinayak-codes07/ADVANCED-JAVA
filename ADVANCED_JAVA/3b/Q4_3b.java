/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/


package StringExercise;

public class Q4_3b {
	
	    public static boolean isPalindrome(String str) {
	        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String rev = new StringBuilder(clean).reverse().toString();
	        return clean.equals(rev);
	    }

	    public static void main(String[] args) {
	        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	    }
	}

