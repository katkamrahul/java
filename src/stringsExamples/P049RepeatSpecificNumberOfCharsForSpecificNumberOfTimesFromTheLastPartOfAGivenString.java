//Repeat a specific number of characters for specific number of times from the last part of a given string.
//Given string = string
//Number of characters for specific number of times = 3
//New string after repetition = inginging

package stringsExamples;

public class P049RepeatSpecificNumberOfCharsForSpecificNumberOfTimesFromTheLastPartOfAGivenString {
	public static void main(String[] args) {
		String str = "string";
		int num = 3;
		System.out.println("Given string = " +str
						+ "\nNumber of characters for specific number of times = " +num);
		String subStr = str.substring(str.length()-num, str.length());
		String newStr = "";
		for(int i=0; i<num; i++) {
			newStr = newStr+subStr;
		}
		System.out.println("New string after repetition = " +newStr);
	}
}