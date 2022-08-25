//Write a Java program to get the contents of a given string as a byte array

package stringsRough;

public class P013GetContentsOfAStringAsByteArray {
	public static void main(String[] args) {
		String str = "This is a sample String.";
		
		byte[] arr = str.getBytes();		// Copy the contents of the String to a byte array.
		
		System.out.println("Contents of a given string as a byte array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(str.charAt(i)+ " = " +arr[i]);
		}
	}
}