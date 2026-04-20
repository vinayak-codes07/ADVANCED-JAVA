/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()
*/

package StringExercise;

public class Q8_3c {
	
	    public static boolean isNumeric(String str) {
	        return str.matches("\\d+");
	    }

	    public static void main(String[] args) {
	        System.out.println(isNumeric("12345"));
	    }
	}

