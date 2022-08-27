/*Write a Java program to print after removing duplicates from a given string.
The given string is: w3resource
After removing duplicates characters the new string is: w3resouc*/

package stringsExamples;

public class P009RemoveDuplicatesFromAGivenString
{
	public static void main(String[] args)
	{
		String str ="w3resource";
		//String str = "aaababbcccbbab";
		System.out.println("Given string : " +str);
		char[] arr = str.toCharArray();
		String targetStr = "";
		for (char value: arr)
		{
			if (targetStr.indexOf(value) == -1)
			{
				targetStr = targetStr + value;
			}
		}
		 System.out.println("After removing duplicates characters the new string is: " +targetStr);
	}
}