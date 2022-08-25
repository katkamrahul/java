//Write a Java program to convert all the characters in a string to lower case.

package stringsRough;

public class P024ConvertAllCharactersInAStringToLowerCase {
	public static void main(String[] args) {
		String str = "The Quick BroWn FoX!";
		System.out.println("Original string : " +str);
		
		String lowerCaseString = str.toLowerCase();
		System.out.println("Lower case string : " +lowerCaseString);
	}
}