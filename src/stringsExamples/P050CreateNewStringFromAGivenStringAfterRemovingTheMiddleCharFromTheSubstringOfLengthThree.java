//Write a Java program to create a new string from a given string after removing the 2nd character
//from the substring of length three starting with 'z' and ending with 'g' presents in the said string.
//Given string = zzgkitandkatz#gcaketoket
//New string = zgkitandkatzgcaketoket

package stringsExamples;

public class P050CreateNewStringFromAGivenStringAfterRemovingTheMiddleCharFromTheSubstringOfLengthThree{
	public static void main(String[] args) {
		String str = "zzgkitandkatz#gcaketoket";
		System.out.println("Giben string = " +str);
		String newStr = "";
		for (int i=0; i<str.length(); i++) {
			newStr = newStr + str.substring(i, i + 1);
			if (i>0 && i<str.length()-1) {
				if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'g') {
					newStr = newStr.substring(0, newStr.length() - 1);
				}
			}
		}
		System.out.println("New string = " + newStr);
	}
}