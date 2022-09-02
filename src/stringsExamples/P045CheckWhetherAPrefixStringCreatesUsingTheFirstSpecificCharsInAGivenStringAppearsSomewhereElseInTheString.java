//Check whether a prefix string creates using the first specific characters in a given string, appears somewhere else in the string.
//Given string = MrsJemsmrsam								Given string = MrsJemsMrsam
//Prefix string length = 3									Prefix string length = 3
//Does 'Mrs' appear else where in the string : FALSE		Does 'Mrs' appear else where in the string : TRUE

package stringsExamples;

public class P045CheckWhetherAPrefixStringCreatesUsingTheFirstSpecificCharsInAGivenStringAppearsSomewhereElseInTheString {
	public static void main(String[] args) {
		String str = "MrsJemsMrsam";
		int strPrefixLen = 3;
		System.out.println("Given String = " +str+ "\nPrefix string length = " +strPrefixLen);
		String subStr = str.substring(0, strPrefixLen);
		System.out.println("New sub string = " +subStr);
		if(str.substring(strPrefixLen, str.length()).contains(subStr))
			System.out.println("Does \""+subStr+"\" appears in the \""+str+"\" : TRUE");
		else
			System.out.println("Does \""+subStr+"\" appears in the \""+str+"\" : FALSE");
	}
}