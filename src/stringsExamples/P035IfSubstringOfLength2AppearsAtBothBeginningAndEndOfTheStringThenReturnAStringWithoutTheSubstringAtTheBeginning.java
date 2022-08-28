//Read a string & if a substring of length two appears at both its beginning & end, 
//return a string without the substring at the beginning otherwise, return the original string unchanged.
//Given string = educated
//New string = ucated

package stringsExamples;

public class P035IfSubstringOfLength2AppearsAtBothBeginningAndEndOfTheStringThenReturnAStringWithoutTheSubstringAtTheBeginning {
	public static void main(String[] args) {
		String str = "educated";
		System.out.println("Given string = " +str);
	
		String subStr1 = str.substring(0, 2), subStr2;
		if(str.endsWith(subStr1)) {
			subStr2 = str.substring(2, str.length());
			System.out.println("New string = " +subStr2);
		}
		else {
			System.out.println("New string = " +str);
		}
	}
}