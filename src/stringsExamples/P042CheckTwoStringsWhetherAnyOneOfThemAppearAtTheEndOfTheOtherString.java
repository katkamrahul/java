//Check two given strings whether any one of them appear at the end of the other string (ignore case).
//String 1 = xyz										String 1 = pqrxyz
//String 2 = pqrxyz										String 2 = xyz
//Is one string appears at the end of other : true		Is one string appears at the end of other : true

package stringsExamples;

import java.util.Scanner;

public class P042CheckTwoStringsWhetherAnyOneOfThemAppearAtTheEndOfTheOtherString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for string 1 : " );
		String str1 = sc.next().toLowerCase();
		str1 = str1.toLowerCase();
		System.out.print("Enter value for string 2 : " );
		String str2 = sc.next().toLowerCase();
		if(str1.endsWith(str2)) {
			System.out.println("Is one string appears at the end of other : TRUE");
		}
		else if(str2.endsWith(str1)) {
			System.out.println("Is one string appears at the end of other : TRUE");
		}
		else {
			System.out.println("Is one string appears at the end of other : FALSE");
		}
		sc.close();
	}
}