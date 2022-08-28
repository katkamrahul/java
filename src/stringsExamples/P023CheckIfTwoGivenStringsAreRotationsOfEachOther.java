//String 1 = ABACD
//String 2 = CDABA
//The concatenation of 1st string twice = ABACDABACD
//The 2nd string CDABA  exists in the new string.
//Strings are rotations of each other

package stringsExamples;

public class P023CheckIfTwoGivenStringsAreRotationsOfEachOther {
	public static void main(String[] args) {
		String s1 = "ABACD", s2 = "CDABA";
		System.out.println("String 1 = " +s1+ "\nString 2 = " +s2);
		
		String str = s1.concat(s1);
		System.out.println("The concatenation of 1st string twice = " +str);
		
		if(str.contains(s2)) {
			System.out.println("The 2nd string 'CDABA' exists in the new string");
			System.out.println("Strings are rotations of each other");
		}
		else {
			System.out.println("The 2nd string 'CDABA' does not exists in the new string");
			System.out.println("Strings are not rotations of each other");
		}
	}
}