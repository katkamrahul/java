/*Write a Java program to remove duplicate characters from a given string presents in another given string.
The given string is: the quick brown fox
The given mask string is: queen
The new string is: th ick brow fox*/

package stringsExamples;

public class P012RemoveDuplicateCharsFromAStringPresentsInAnotherString {
	public static void main(String[] args) {
		String str1 = "the quick brown fox";
		String str2 = "queen";
		System.out.println("The given string = " +str1+ "\nThe mask string = " +str2);
		for(int i=0; i<str2.length(); i++)
		{
			char c = str2.charAt(i);
			String x = Character.toString(c);
			for(int j=0; j<str1.length(); j++)
			{
				char ch = str1.charAt(j);
				if(c == ch)
				{
					str1 = str1.replace(x, "");
					
				}
			}
		}
		System.out.println("Replaces string = " +str1);
	}
}