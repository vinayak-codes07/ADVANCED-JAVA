/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/


package StringExercise;

public class Q6_3c {

	    public static String capitalizeWords(String str) {
	        String[] words = str.split("\\s+");
	        StringBuilder result = new StringBuilder();
	        for (String w : words) {
	            result.append(Character.toUpperCase(w.charAt(0)))
	                  .append(w.substring(1).toLowerCase())
	                  .append(" ");
	        }
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        System.out.println(capitalizeWords("java programming language"));
	    }
	}

