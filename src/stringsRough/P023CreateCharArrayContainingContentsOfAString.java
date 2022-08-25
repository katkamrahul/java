//Write a Java program to create a character array containing the contents of a string.

package stringsRough;

public class P023CreateCharArrayContainingContentsOfAString {
	public static void main(String[] args) {
		String str = "Java Exercises.";
		System.out.println("Original String : " +str);
		
		char[] arr = str.toCharArray();
		
		System.out.println("String to character array : ");
		for(char c : arr)
			System.out.println(c);
	}
}