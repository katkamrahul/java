//Write a Java program to create a new String object with the contents of a character array.

package stringsRough;

public class P009CreateNewStringObjectWithContentsOfCharArray {
	public static void main(String[] args) {
		char[] arr = {'a', 'e', 'i', 'o', 'u'};
		
		System.out.print("Array = ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		String str1 = String.copyValueOf(arr);
		System.out.println("\nCharacter array to string = " +str1);
		
		String str2 = String.copyValueOf(arr, 1, 3);
		System.out.println("Character array to string from length 2 to 4 = " +str2);
	}
}