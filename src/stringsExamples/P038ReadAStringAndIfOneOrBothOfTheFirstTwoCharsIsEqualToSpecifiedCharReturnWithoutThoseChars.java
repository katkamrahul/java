//Read a string and if one or both of the first two characters is equal to specified character,
//return without those characters otherwise return the string unchanged.
//Given character = o
//String 1 = photo		String 2 = oocyte	String 3 = boat		String 4 = own
//New string = photo	New string = cyte	New string = bat	New string = wn

package stringsExamples;

public class P038ReadAStringAndIfOneOrBothOfTheFirstTwoCharsIsEqualToSpecifiedCharReturnWithoutThoseChars {
	public static void main(String[] args) {
		char ch = 'o';
		System.out.println("Given character = " +ch);
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