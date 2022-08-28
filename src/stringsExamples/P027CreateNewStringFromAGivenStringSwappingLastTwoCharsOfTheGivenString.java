//Create a new string from a given string swapping the last two characters of the given string.
//The length of the given string must be two or more.
//Given string = string
//The string after swapping last two characters = strign

package stringsExamples;

public class P027CreateNewStringFromAGivenStringSwappingLastTwoCharsOfTheGivenString {
	public static void main(String[] args) {
		String str = "string";
		System.out.println("Given String = " +str);
		
		char last = str.charAt(str.length()-1);
		char secondLast = str.charAt(str.length()-2);
		
		String newStr = str.substring(0, str.length()-2) + last + secondLast;
		System.out.println("The string after swapping last two characters = " +newStr);
	}
}