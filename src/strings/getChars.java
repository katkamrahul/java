package strings;

public class getChars {
	public static void main(String[] args) {
		String str = "This is a sample String.";
		
		char[] arr = new char[str.length()];
		
		str.getChars(0, str.length(), arr, 0);		// Copy the contents of the String to a character array.
													// Copy characters from 0 to length of string of str.
													// Fill the source array arr starting at position 0.
		
		System.out.println("Contents of a given string as a character array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(str.charAt(i)+ " = " +arr[i]);
		}
	}
}