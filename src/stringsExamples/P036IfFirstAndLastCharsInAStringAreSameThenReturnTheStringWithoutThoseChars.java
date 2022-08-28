//Read a given string and if the first or last characters are same return the string 
//without those characters otherwise return the string unchanged.
//Given string = testcricket
//New string = estcricke

package stringsExamples;

public class P036IfFirstAndLastCharsInAStringAreSameThenReturnTheStringWithoutThoseChars {
	public static void main(String[] args) {
		String str = "testcricket";
		System.out.println("Given string = " +str);
		
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			str = str.substring(1, str.length()-1);
			System.out.println("New string = " +str);
		}
		else {
			System.out.println("New string = " +str);
		}
	}
}