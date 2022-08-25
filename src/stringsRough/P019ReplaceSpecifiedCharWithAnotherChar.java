//Write a Java program to replace a specified character with another character.

package stringsRough;

public class P019ReplaceSpecifiedCharWithAnotherChar {
	public static void main(String[] args) {
		String str = "The quick brown dog jumps over the lazy dog.";
		System.out.println("Original string : " +str);
		
		String newStr = str.replace('o', 'd');
		System.out.println("'o' replaced in string with 'd' : " +newStr);
	}
}