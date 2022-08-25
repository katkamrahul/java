//Write a Java program to find the second most frequent character in a given string.

package stringsExamples;

import java.util.Arrays;

public class P005FindSecondMostFrequentCharInAGivenString {
	public static void main(String[] args) 
	{
		String str = "successes";
		System.out.println("Given string = " +str);
		
		int[] arr = new int[str.length()];
		
		char c, z;
		for(int i=0; i<str.length(); i++)
		{
			c = str.charAt(i);
			int count = 0;
			for(int j=0; j<str.length(); j++)
			{
				z = str.charAt(j);
				if(c==z) 
				{
					count++;
				}
				
			}
			arr[i]=count;
		}
		
		//Copying all elements from arr to arr1 
		int arr1[] = new int[arr.length];    
        for (int i = 0; i < arr1.length; i++) {     
            arr1[i] = arr[i];     
        }
		
        //Sorting array
		Arrays.sort(arr1);
		int num=0;
		for(int k=arr1.length-1; k>=0; k--)
		{
			if(arr1[arr1.length-1] != arr1[k]) 
			{
				num = arr1[k];
				break;
			}
		}
		
		int index=0;
		for(int x=0; x<arr.length; x++) 
		{
			int temp1 = arr[x];
			if(temp1 == num) 
			{
				index = x;
				break;
			}
		}
		
		System.out.println("Second most frequent character in a given string = " +str.charAt(index));
	}
}