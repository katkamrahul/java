//Write a Java program to remove any leading or trailing whitespace from a given string

package stringsRough;

public class P026RemoveAnyLeadingOrTrailingWhitespaceFromAGivenString {
	public static void main(String[] args) {
		String str = "      Java Exercises     ";
		System.out.println("Given String : " +str);
		
		str = str.trim();
		System.out.println("String after removing leading or trailing whitespace : " +str);
	}	
}