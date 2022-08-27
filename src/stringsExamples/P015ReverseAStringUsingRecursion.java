/*Write a Java program to reverse a string using recursion.
The given string is: The quick brown fox jumps
Reverse order string is: spmuj xof nworb kciuq ehT*/

package stringsExamples;

public class P015ReverseAStringUsingRecursion {
	  public static void main(String[] args) { 
		  String str = "The quick brown fox jumps"; 
		  System.out.println("Given String = " +str);
		  String newStr = ""; 
		  for(int i = 0; i<str.length(); i++) 
			  newStr = str.charAt(i) + newStr; 
		  System.out.println("Reverse order string = " +newStr);
	  }
	
/*	void reverseStringWithRecursion(String str){
		if ((str == null) || (str.length() <= 1)) {
			System.out.println(str);
		}
		else {
			System.out.print(str.charAt(str.length() - 1));
			reverseStringWithRecursion(str.substring(0, str.length() - 1));
		}
	}
	
	public static void main(String[] args) {
		String str = "The quick brown fox jumps";
		System.out.println("Given string : " +str);
		P015ReverseAStringUsingRecursion P015 = new P015ReverseAStringUsingRecursion();
		P015.reverseStringWithRecursion(str);
	}*/
}