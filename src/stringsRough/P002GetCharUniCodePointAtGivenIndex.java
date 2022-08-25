//Write a Java program to get the character (Unicode code point) at the given index within the String.

package stringsRough;

public class P002GetCharUniCodePointAtGivenIndex {
	   public static void main(String[] args) {
		    String str = "w3resource.com";
		    System.out.println("Original String : " + str);
		    int val1 = str.codePointAt(1);		    // codepoint at index 1
		    int val2 = str.codePointAt(9);		    // codepoint at index 9

		    System.out.println("Character(unicode point) = " + val1);
		    System.out.println("Character(unicode point) = " + val2);
	   }
}