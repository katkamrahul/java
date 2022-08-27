/*Write a Java program to find first non repeating character in a string.
The given string is: gibbleogabbler
The first non repeated character in String is: o*/

package stringsExamples;

public class P010FindFirstNonRepeatingCharInAString
{
	public static void main(String[] args)
	{
		String str = "gibbleogabblier";
		for(int i=0; i<str.length()-1; i++)
		{
			boolean flag = false;
			char c = str.charAt(i);
			for(int j=i+1; j<str.length(); j++)
			{
				if(c == str.charAt(j))
					flag = true;
			}
			if(flag == false)
			{
				System.out.println("The first non repeated character in String = " +c);
				break;
			}
		}
	}
}