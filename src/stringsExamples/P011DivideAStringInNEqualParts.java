/*Write a Java program to divide a string in n equal parts.
The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are:
abcde
fghij
klmno
pqrst
uvwxy*/

package stringsExamples;

public class P011DivideAStringInNEqualParts {
	public static void main(String[] args)
	{
		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("The given string is: " + str);
		int num = 0;
		for(int i=0; i<str.length(); i++)
		{	
			if(i*i == str.length())
			{
				num = i;
				break;
			}
		}

		if(num == 0)
		{
			System.out.println("Given string cannot be divided into equal parts");
			return;
		}
		else
		{
			System.out.println("The string can be divided into " + num + " parts and they are: ");
			for (int i = 0; i < str.length(); i++) 
			{
				if (i % num == 0)
				{
					System.out.println();
				}
				System.out.print(str.charAt(i));
		   }
		}
	}
}