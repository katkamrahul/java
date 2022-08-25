//Check whether the contents of a given string is equal to the specified character sequence

package stringsRough;

public class P008CheckTheContentsOfAGivenStringIsEqualToSpecifiedStringBuffer {
	public static void main(String[] args) {
		String str1 = "example.com", str2 = "Example.com";
	    StringBuffer sb = new StringBuffer("example.com");
	    
	    System.out.println("String 1: " +str1);
	    System.out.println("String 2: " +str2);
	    System.out.println("String Buffer: " +sb);
	    
	    System.out.println("Comparing string 1 \"" +str1+ "\" and string buffer \"" +sb+ "\" : " + str1.contentEquals(sb));
	    System.out.println("Comparing string 2 \"" +str2+ "\" and string buffer \"" +sb+ "\" : " + str2.contentEquals(sb));
	}
}