//Write a Java program to check whether a given string starts with the contents of another string.

package stringsRough;

public class P021CheckWhetherAStringStartsWithContentsOfAnotherString {
	public static void main(String[] args) {
		String str = "Red is my favorite color.";
		
		boolean check1 = str.startsWith("Red");
		System.out.println("Dose the string \"Red is my favorite color.\" starts with \"Red\" ? " +check1);
		
		boolean check2 = str.startsWith("favo", 10);
		System.out.println("Dose the string \"Red is my favorite color.\" starts with \"favo\" from index 10 ? " +check2);
	}
}