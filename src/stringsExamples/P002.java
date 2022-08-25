//Input = "123abc49cd208"		Output = 123+49+208=380

package stringsExamples;

import java.io.IOException;

public class P002 {
	public static void main(String[] args) throws IOException
	{
		String s="123abc49cd208";
		char[] k = new char[50];
		String s1;
		int a, sum=0, i, j=0;
		for(i=0; i<=s.length(); i++)
		{
			if(s.charAt(i)<=0  && s.charAt(i)>=9)
			{
				k[j++]=s.charAt(i);
				
				//s1[j++]=s[i];
			}
			else
				continue;
		}
		//System.out.println("new string : "+s1);
	}
}