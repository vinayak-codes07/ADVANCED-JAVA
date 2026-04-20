/*2 a. Develop a java program for performing various string operations with different string handling
functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
Substring Operations , String Modification, Whitespace Handling, String Concatenation, String
Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and
endsWith()*/
package String;
import java.util.*;

public class StringOperations {
    public static void main(String[] args) {

        String s1 = "Apple";
        String s2 = new String("Banana");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.length());
        System.out.println(s1.charAt(2));

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase("apple"));

        System.out.println(s1.contains("pp"));
        System.out.println(s1.indexOf("p"));

        System.out.println(s1.substring(1, 4));

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        String s3 = "   AIET   ";
        System.out.println(s3.trim());

        String s4 = s1.concat(" ").concat(s2);
        System.out.println(s4);

        String s5 = "Java,Python,C++";
        String[] arr = s5.split(",");
        for(String str : arr) {
            System.out.println(str);
        }

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        String formatted = String.format("Name: %s Age: %d", "Vivek", 20);
        System.out.println(formatted);

        String email = "vivek@gmail.com";
        boolean valid = email.contains("@") && email.startsWith("vivek") && email.endsWith(".com");
        System.out.println(valid);
    }
}