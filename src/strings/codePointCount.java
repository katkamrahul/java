package strings;

public class codePointCount {
	public static void main(String[] args) {
		String str = "w3resource.com";
	    System.out.println("Original String : " + str);
	        
	    int ctr = str.codePointCount(1, 10);		// codepoint from index 1 to index 10
	    
	    System.out.println("Codepoint count = " + ctr);			// prints character from index 1 to index 10
	}
}