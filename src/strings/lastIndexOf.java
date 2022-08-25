package strings;

public class lastIndexOf {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";
		
		int lastIndexOfChar = str.lastIndexOf('q');
		System.out.println("Last index of character \"q\" = " +lastIndexOfChar);
		
		int lastIndexOfStr = str.lastIndexOf("brown");
		System.out.println("Last index of string \"brown\" = " +lastIndexOfStr);
		
		int lastIndexOfChar1 = str.lastIndexOf('m', 10);
		System.out.println("Last index of character \"m\" starting from index 10 = " +lastIndexOfChar1);
		
		int lastIndexOfStr2 = str.lastIndexOf("over", 12);
		System.out.println("Last index of string \"over\" starting from index 12 = " +lastIndexOfStr2);
	}
}