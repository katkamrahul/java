//Write a Java program to read two strings append them together and return the result. If the strings are 
//of different lengths, remove characters from the beginning of longer string and make them equal length.
//String 1 = Welcome 
//String 2 = home
//New string = comehome

package stringsExamples;

public class P030ReadTwoStringsMakeThemOFSameLengthAndAppendThemTogether {
	public static void main(String[] args) {
		String str1 = "Welcome", str2 = "home", newStr="";
		System.out.println("String 1 = " +str1+ "\nString 2 = " +str2);
		
		
		if(str1.length() == str2.length()) {
			newStr = str1.concat(str2);
			System.out.println("New string = " +newStr);
		}
		else if(str1.length() > str2.length()) {
			int len = str1.length() - str2.length();
			for(int i=0; i<len; i++) {
				char c = str1.charAt(0);
				String s = Character.toString(c);
				str1 = str1.replaceFirst(s, "");
			}
			newStr = str1.concat(str2);
			System.out.println("New string = " +newStr);
		}
		else {
			int len = str2.length() - str1.length();
			for(int i=0; i<len; i++) {
				char c = str2.charAt(0);
				String s = Character.toString(c);
				str2 = str2.replaceFirst(s, "");
			}
			newStr = str1.concat(str2);
			System.out.println("New string = " +newStr);
		}
		
	}
}