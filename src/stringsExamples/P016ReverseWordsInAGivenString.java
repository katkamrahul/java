//Write a Java program to reverse words in a given string.
//Given string = Reverse words in a given string
//String after words reversed = string given a in words Reverse

package stringsExamples;

public class P016ReverseWordsInAGivenString {
	public static void main(String[] args) {
		String str = "Reverse words in a given string";
		System.out.println("Given string = " +str);
		String[] lstStr = str.split(" ");
		String newStr = "";
		for(int i=lstStr.length-1; i>=0; i--) {
			newStr = newStr + lstStr[i] + " ";
		}
		newStr = newStr.trim();
		System.out.println("String after words reversed = " +newStr);
	}
}