//Write a Java program to find first non-repeating character from a stream of characters.
//Given String = godisgood
//The first non-repeating character =  i

package stringsExamples;

public class P020FindFirstNonRepeatingCharFromAGivenString {
	public static void main(String[] args) {
		String str = "godisgood";
		System.out.println("Given String = " +str);
		char c = '$';
		for(int i = 0; i<str.length(); i++) {
			int count = 0;
			for(int j = 0; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if(count == 1) {
				c = str.charAt(i);
				break;
			}
		}
		
		if(c== '$')
			System.out.println("There are no characters that are non-repeating in the string");
		else
			System.out.println("The first non-repeating character = " +c);
	}
}