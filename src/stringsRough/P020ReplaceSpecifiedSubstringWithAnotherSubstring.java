//Write a Java program to replace a specified substring with another substring.

package stringsRough;

public class P020ReplaceSpecifiedSubstringWithAnotherSubstring {
	public static void main(String[] args) {
		String str = "The quick brown dog jumps over the lazy dog.";
		System.out.println("Original string : " +str);
		
		String newStr = str.replaceAll("dog", "cat");
		System.out.println("Substring \"dog\" replaced in string with \"cat\" : " +newStr);
	}
}