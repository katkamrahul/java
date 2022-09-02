//Write a Java program to count how many times the substring 'life' present at anywhere in a given string. 
//Counting can also happen for the substring 'li?e', any character instead of 'f'.
//Given string = liveonwildlife
//The substring life or li?e appear number of times: 2

package stringsExamples;

import java.util.Scanner;

public class P047CountHowManyTimesSubstringIsPresentAnywhereInAGivenStringWithCondition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Given string = ");
		String str=sc.nextLine();
		int strLen=str.length();
		int count=0;
		for(int i=0; i<strLen; i++) {
			if(str.charAt(i)=='l' && str.charAt(i+1)=='i' && str.charAt(i+3)=='e') {
				count++;
			}
		}
		if(count==0) 
			System.out.println("The substring 'life' or 'li?e' does not appear in the string '" +str+ "'");
		else
			System.out.println("The substring 'life' or 'li?e' appears "+count+" times in the string '"+str+ "'");
		sc.close();
	}
}