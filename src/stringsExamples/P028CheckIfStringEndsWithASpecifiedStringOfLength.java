//Write a Java program to read a string and return true if it ends with a specified string of length.
//String 1 = string
//Does string 1 contains 'ng' at the last = true
//String 2 = strign
//Does string 2 contains 'ng' at the last = false

package stringsExamples;

public class P028CheckIfStringEndsWithASpecifiedStringOfLength {
	public static void main(String[] args) {
		String str1 = "string";
		String str2= "strign";

		System.out.println("String 1 = " +str1);
		System.out.println("Does string 1 contains 'ng' at the last = " +str1.endsWith("ng"));
		
		System.out.println("String 2 = " +str2);
		System.out.println("Does string 2 contains 'ng' at the last = " +str2.endsWith("ng"));
	}
}