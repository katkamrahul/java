package strings;

public class toCharArray {
	public static void main(String[] args) {
		String str = "Java Exercises.";
		System.out.println("Original String : " +str);
		
		char[] arr = str.toCharArray();
		
		System.out.println("String to character array : ");
		for(char c : arr)
			System.out.println(c);
	}
}