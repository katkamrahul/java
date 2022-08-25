package strings;

public class codePointAt {
	   public static void main(String[] args) {
		    String str = "w3resource.com";
		    System.out.println("Original String : " + str);
		    
		    int val1 = str.codePointAt(1);		    // codepoint at index 1
		    int val2 = str.codePointAt(9);		    // codepoint at index 9

		    System.out.println("Character unicode point at index 1 = " + val1);
		    System.out.println("Character unicode point at index 9 = " + val2);
	   }
}