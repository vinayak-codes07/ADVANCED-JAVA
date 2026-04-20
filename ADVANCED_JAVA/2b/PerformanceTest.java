/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending
the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which
one is better.*/


package StringBuffer_and_StringBuilder;

public class PerformanceTest {
	
	    public static void main(String[] args) {

	        long start, end;

	        StringBuffer sbf = new StringBuffer();
	        start = System.currentTimeMillis();
	        for(int i = 0; i < 10000; i++) {
	            sbf.append("AIET");
	        }
	        end = System.currentTimeMillis();
	        System.out.println("StringBuffer Time: " + (end - start));

	        StringBuilder sbd = new StringBuilder();
	        start = System.currentTimeMillis();
	        for(int i = 0; i < 10000; i++) {
	            sbd.append("AIET");
	        }
	        end = System.currentTimeMillis();
	        System.out.println("StringBuilder Time: " + (end - start));
	    }
	}

