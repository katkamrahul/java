package strings;

public class indexOf {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";
		
		int indexOfChar = str.indexOf('q');
		System.out.println("Index of character \"q\" = " +indexOfChar);
		
		int indexOfStr = str.indexOf("brown");
		System.out.println("Index of string \"brown\" = " +indexOfStr);
		
		int indexOfChar1 = str.indexOf('m', 10);
		System.out.println("Index of character \"m\" starting from index 10 = " +indexOfChar1);
		
		int indexOfStr2 = str.indexOf("over", 12);
		System.out.println("Index of string \"over\" starting from index 12 = " +indexOfStr2);
	}
}