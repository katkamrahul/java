//Write a Java program to reverse every word in a string using methods.
//Given string = This is a test string
//String reversed word by word = sihT si a tset gnirts

package stringsExamples;

public class P017ReverseEveryWordInAStringUsingMethods {
	public static void main(String[] args) {
		String str = "This is a test string";
		System.out.println("Given string = " +str);
		String[] arr = str.split(" ");
		String newStr = "";
		for(int i=0; i<arr.length; i++) {
			String tempStr = arr[i];
			String s = "";
			for(int j = 0; j<tempStr.length(); j++) {
				s = tempStr.charAt(j) + s;
			}
			newStr = newStr + s + " ";
		}
		newStr = newStr.trim();
		System.out.println("String reversed word by word = " +newStr);
	}
}