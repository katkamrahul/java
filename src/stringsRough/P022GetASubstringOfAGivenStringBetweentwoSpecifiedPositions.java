//Write a Java program to get a substring of a given string between two specified positions.

package stringsRough;

public class P022GetASubstringOfAGivenStringBetweentwoSpecifiedPositions {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";
		System.out.println("String : " +str);
		
		String subStr1 = str.substring(10);
		System.out.println("Sub string starting from index 10 : " +subStr1);
		
		String subStr2 = str.substring(10, 19);
		System.out.println("Sub string starting from index 10 till index 19 : " +subStr2);
	}
}