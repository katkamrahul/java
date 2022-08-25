package strings;

public class contentEquals {
	public static void main(String[] args) {
		String str1 = "example.com";
		String str2 = "Example.com";
	    CharSequence cs = "example.com";
	    StringBuffer sb = new StringBuffer("Example.com");
	    
	    System.out.println("String 1: " +str1);
	    System.out.println("String 2: " +str2);
	    System.out.println("Character Sequence: " +cs);
	    System.out.println("Character Sequence: " +sb);
	    
	    System.out.println("Comparing string 1 \"" +str1+ "\" and character sequence \"" +cs+ "\" : " + str1.contentEquals(cs));
	    System.out.println("Comparing string 2 \"" +str2+ "\" and character sequence \"" +cs+ "\" : " + str2.contentEquals(cs));
	    
	    System.out.println("Comparing string 1 \"" +str1+ "\" and string buffer \"" +sb+ "\" : " + str1.contentEquals(sb));
	    System.out.println("Comparing string 2 \"" +str2+ "\" and string buffer \"" +sb+ "\" : " + str2.contentEquals(sb));
	}
}