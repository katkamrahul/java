//Write a Java program to count and print all the duplicates in the input string.
//Given string = w3resource
//The duplicate characters and counts are: 
//e  appears  2  times
//r  appears  2  times

/* package stringsExamples;

public class P022CounTAndPrintAllDuplicatesIntheString {
	public static void main(String[] args) {
		String s = "w3resourcre";
		System.out.println("Given string = " +s);
		for(int i=0; i<s.length()-1; i++) {
			int count = 1;
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if(count > 1) {
				System.out.println("Character '" +s.charAt(i)+ "' appears " +count+ " times in the string");
			}
		}
	}
}
*/

package stringsExamples;

public class P022CounTAndPrintAllDuplicatesIntheString
{
	public static void main(String[] args)
	{
		String s = "kaarktik";
		char s1[]=new char[10];
		int k=0;
		System.out.println("Given string = " +s);
		for(int i=0; i<s.length()-1; i++) 
		{
				if(s.charAt(i)==s1[k++])
					continue;
				else
				{
					int count=0;
					for(int j=i+1; j<s.length(); j++) 
					{
							if(s.charAt(i) == s.charAt(j))
							{
									count++;		
							}
					}
					if(count >=1) 
					{
						System.out.println("Character '" +s.charAt(i)+ "' appears " +count+ " times in the string");
						s1[i]=s.charAt(i);
					}
				}
			}
	}
}

