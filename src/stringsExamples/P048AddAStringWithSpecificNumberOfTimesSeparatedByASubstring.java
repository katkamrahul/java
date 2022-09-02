//Write a Java program to add a string with specific number of times separated by a substring.
//String 1 = try	String 2 = best
//Number to times to be repeat = 3
//New string = trybesttrybesttry

package stringsExamples;

public class P048AddAStringWithSpecificNumberOfTimesSeparatedByASubstring {
	public static void main(String[] args) {
		String str1 = "try", str2 = "best";
		System.out.println("String 1 = " +str1+ "\nString 2 = " +str2);
		int repeat = 3;
		System.out.println("Number to times to be repeat = " +repeat);
		String newStr = "";
		for(int i=0; i<repeat; i++){
			newStr=newStr+str1;
			if(i != 2) {
				newStr = newStr + str2;
			}
		}
		System.out.println("New string = " +newStr);
	}
}