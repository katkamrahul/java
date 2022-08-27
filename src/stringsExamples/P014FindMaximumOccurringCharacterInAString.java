/*Write a Java program to find the maximum occurring character in a string
The given string is: test string
Max occurring character in the given string is: t*/

package stringsExamples;

public class P014FindMaximumOccurringCharacterInAString {
	public static void main(String[] args) {
		String str = "test string";
		System.out.println("Given string = " +str);
		int num = 0;
		char ch='$';
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			int count = 0;
			for(int j=0; j<str.length(); j++) {
				if(c == str.charAt(j)) {
					count++;
				}
			}
			if(count>num) {
				num = count;
				ch = c;
			}
		}
		System.out.println("Maximum occurring character in the given string is = " +ch);
	}
}