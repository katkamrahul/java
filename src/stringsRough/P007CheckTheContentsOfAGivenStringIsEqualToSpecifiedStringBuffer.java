//Check whether the contents of a given string is equal to the specified character sequence

package stringsRough;

public class P007CheckTheContentsOfAGivenStringIsEqualToSpecifiedStringBuffer {
	public static void main(String[] args) {
		String str1 = "example.com", str2 = "Example.com";
	    CharSequence cs = "example.com";
	    
	    System.out.println("String 1: " +str1);
	    System.out.println("String 2: " +str2);
	    System.out.println("Character Sequence: " +cs);
	    
	    System.out.println("Comparing string 1 \"" +str1+ "\" and character sequence \"" +cs+ "\" : " + str1.contentEquals(cs));
	    System.out.println("Comparing string 2 \"" +str2+ "\" and character sequence \"" +cs+ "\" : " + str2.contentEquals(cs));
	}
}