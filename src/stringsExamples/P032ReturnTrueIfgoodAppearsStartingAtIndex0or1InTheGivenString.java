//Read a string and return true if "good" appears starting at index 0 or 1 in the given string.
//Given string = goodboy
//'good' appears in the string = true

package stringsExamples;

public class P032ReturnTrueIfgoodAppearsStartingAtIndex0or1InTheGivenString {
	public static void main(String[] args) {
		String str = "goodboy";
		System.out.println("Given string = " +str);
		
		if(str.startsWith("good")) {
			System.out.println("True : 'good' appears in the string starting at index 0");
		}
		else if(str.startsWith("good", 1)) {
			System.out.println("True : 'good' appears in the string starting at index 1");
		}
		else {
			System.out.println("False : 'good' does not appear in the string starting at index 0 or 1");
		}
	}
}