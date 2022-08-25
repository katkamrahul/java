////Write a Java program to convert all the characters in a string to upper case.

package stringsRough;

public class P025ConvertAllTheCharactersInAStringToUpperCase {
	public static void main(String[] args) {
		String str = "The Quick BroWn FoX!";
		System.out.println("Original string : " +str);
		
		String upperCaseString = str.toUpperCase();
		System.out.println("Upper case string : " +upperCaseString);
	}
}