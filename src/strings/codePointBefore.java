package strings;

public class codePointBefore {
	public static void main(String[] args) {
		String str = "w3resource.com";
		System.out.println("Original String : " + str);
		
		int val1 = str.codePointBefore(1);			// codepoint before index 1
		int val2 = str.codePointBefore(9);			// codepoint before index 9
		
		System.out.println("Character unicode point before index 1 = " + val1);
		System.out.println("Character unicode point before index 9 = " + val2);
	}
}