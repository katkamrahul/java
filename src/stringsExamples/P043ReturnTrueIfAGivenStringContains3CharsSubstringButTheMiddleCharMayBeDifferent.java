//Return true if a given string contain the string 'pop', but the middle 'o' also may other character.
//Given string = dikchapop							Given string = dikp$pdik
//Does p?p appear in the given string : true		Does p?p appear in the given string : true

package stringsExamples;

import java.util.Scanner;

public class P043ReturnTrueIfAGivenStringContains3CharsSubstringButTheMiddleCharMayBeDifferent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str = sc.next().toLowerCase();
		System.out.print("Enter sub string : ");
		String subStr = sc.next().toLowerCase();
		
		boolean flag = false;
		if(str.contains(subStr)) {
			System.out.println("Does p?p appear in the given string : TRUE");
		}
		else {
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==subStr.charAt(0) && str.charAt(i+2)==subStr.charAt(2)) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println("Does p?p appear in the given string : TRUE");
			}
			else {
				System.out.println("Does p?p appear in the given string : FALSE");
			}
		}
		sc.close();
	}
}