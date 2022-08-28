//Read a string and returns after removing a specified character & its immediate left and right characters.
//Given character = #
//String 1 = test#string		String 2 = test##string		String 3 = test#the#string
//New string = testring			New string = testring		New string = teshtring	

package stringsExamples;

public class P039ReadAStringAndReturnAfterRemovingASpecifiedCharAndItsImmediateLeftAndRightChars {
	public static void main(String[] args) {
		char ch = '#';
		String[] arr = {"photo", "oocyte", "boat", "own"};
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			System.out.println("String " +count+ " = " +str);
			if(str.charAt(0)!=ch && str.charAt(1)!=ch) {
				System.out.println("New String = " +str);
				count++;
			}
			else if(str.charAt(0)==ch && str.charAt(1)!=ch) {
				System.out.println("New String = " +str.substring(1, str.length()));
				count++;
			}
			else if(str.charAt(0)!=ch && str.charAt(1)==ch) {
				System.out.println("New String = " +(str.substring(0, 1) + str.substring(2, str.length())));
				count++;
			}
			else {
				System.out.println("New String = " +str.substring(2, str.length()));
				count++;
			}
		}
	}
}