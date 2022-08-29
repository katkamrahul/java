//Read a string and returns after removing a specified character & its immediate left and right characters.
//Given character = #
//String 1 = test#string	String 2 = test##string		String 3 = test#the#string	 String 4 = teststring
//New string = testring		New string = testring		New string = teshtring		 New string = teststring

package stringsExamples;

public class P039ReadAStringAndReturnAfterRemovingASpecifiedCharAndItsImmediateLeftAndRightChars {
	public static void main(String[] args) {
		char ch = '#';
		String s = Character.toString(ch);
		System.out.println("Given character = " +ch);
		String[] arr = {"test#string", "test##string", "test#the#string", "teststring"};
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			System.out.println("String " +count+ " = " +str);
			if(str.contains(s)) {
				String s1 = "";
				for(int j=0; j<str.length(); j++) {
					int n = 0;
					if(str.charAt(j)==ch) {
						n = str.indexOf(str.charAt(j));
						s1 = str.substring(0, n-1) + str.substring(n+1, str.length());
					}
				}
			}
			else {
				System.out.println("Given character " +ch+ " is not present in the string");
			}
		}
	}
}