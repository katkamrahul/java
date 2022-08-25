//Write a Java program to check whether a given string ends with the contents of another string

package stringsRough;

public class P010CheckAStringEndsWithContentsOfAnotherString {
	public static void main(String[] args) {
		String str1 = "Python Exercises";
		String str2 = "Python Exercise";
		String endStr = "se";
		
		System.out.println("String 1 = " +str1);
		System.out.println("String 2 = " +str2);
		System.out.println("End String = " +endStr);
		
		System.out.println("Does string 1 \"" +str1+ "\" ends with \"" +endStr+ "\" : " +str1.endsWith(endStr));
		System.out.println("Does string 2 \"" +str2+ "\" ends with \"" +endStr+ "\" : " +str2.endsWith(endStr));
	}
}