//Write a Java program to check whether a substring appears before a period(.) within a given string
//Given string = testabc.test						Given string = test.abctest
//Does 'abc' appear before period (.) = TRUE		Does 'abc' appear before period (.) = false

package stringsExamples;

public class P044CheckWhetherASubstringAppearsBeforeAPeriodWithinAGivenString {
	public static void main(String[] args) {
		String str = "testabc.test";
		String subStr = "abc";
		System.out.println("Given string = " +str+ "\nGiven sub string = " +subStr);
		if(str.contains(".")) {
			int periodIndex = str.indexOf('.');
			int len = subStr.length();
			String newStr = str.substring(periodIndex-len, periodIndex);
			if(newStr.equals(subStr)) {
				System.out.println("Does 'abc' appear before period (.) = TRUE");
			}
			else {
				System.out.println("Does 'abc' appear before period (.) = FALSE");
			}
		}
		else {
			System.out.println("String \"" +str+ "\" does not contain period (.)");
		}
	}
}