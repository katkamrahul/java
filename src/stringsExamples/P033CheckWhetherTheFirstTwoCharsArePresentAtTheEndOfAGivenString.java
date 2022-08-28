//Write a Java program to check whether the first two characters present at the end of a given string.
//Given string = educated
//True : The first two characters also appear at the end in the string

package stringsExamples;

public class P033CheckWhetherTheFirstTwoCharsArePresentAtTheEndOfAGivenString {
	public static void main(String[] args) {
		String str = "educated";
		System.out.println("Given string = " +str);
		
		String subStr = str.substring(0, 2);
		
		if(str.endsWith(subStr))
			System.out.println("True : The first two characters also appear at the end in the string");
		else
			System.out.println("False : The first two characters does not appear at the end in the string");
	}
}