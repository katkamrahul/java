//Write a Java program to read a string, if the string begins with "red" or "black" 
//return that colour string, otherwise return the empty string.
//Given string  = blacksea
//The string begins with the colour = black

package stringsExamples;

public class P029CheckIfStringStartsWithASpecifiedStringOfLength {
	public static void main(String[] args) {
		String str = "blacksea";
		System.out.println("Given string = " +str);
		
		if(str.startsWith("black"))
			System.out.println("The string begins with the colour = black");
		else if(str.startsWith("red"))
			System.out.println("The string begins with the colour = red");
		else
			System.out.println("The string begins with the colour = ");
	}
}