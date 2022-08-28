//Write a Java program to remove "b" and "ac" from a given string.
//The given string is: abrambacbasc
//String after removing 'b'= aramacasc
//String after removing 'ac'= aramasc

package stringsExamples;

public class P019RemoveCharsFromAGivenString {
	public static void main(String[] args) {
		String str = "abrambacbasc";
		str = str.replaceAll("b", "");
		System.out.println("String after removing 'b' : " +str);
		
		str = str.replaceAll("ac", "");
		System.out.println("String after removing 'ac' : " +str);
	}
}