//Create a new string taking specified number of chars from first and last position of a given string.
//Given string = Welccome
//Given number = 3
//New string = Welome

package stringsExamples;

public class P031CreateNewStringTakingSpecifiedNumberOfCharsFromFirstAndLastPositionOfAGivenString {
	public static void main(String[] args) {
		String str = "Welccome";
		System.out.println("Given string = " +str);
		int num = 3;
		System.out.println("Given number = " +num);
		
		String newStr = str.substring(0, num) 
						+ str.substring(num+1, str.length()-(num+1)) 
						+ str.substring(str.length()-(num), str.length());
		System.out.println("New string = " +newStr);
	}
}