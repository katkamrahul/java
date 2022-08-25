//Write a Java program to concatenate a given string to the end of another string.

package stringsRough;

public class P005ConcatenateGivenStringToEndOfAnotherString {
	public static void main(String[] args) {
		String str1 = "PHP Exercises and";
		String str2 = " HTML Exercises";
		String str3 = " and SQL Exercises";
		String con;
		
		System.out.println("String 1 = " +str1);
		System.out.println("String 2 = " +str2);
		System.out.println("String 3 = " +str3);
		
		con = str1.concat(str2);
		
		System.out.println("Concatenation of string 1 and string 2: " +con);
		
		con = str1.concat(str2).concat(str3);
		System.out.println("Concatenation of string 1, string 2 and string 3: " +con);
	}	
}