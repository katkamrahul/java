package strings;

public class replace {
	public static void main(String[] args) {
		String str = "The quick brown dog jumps over the lazy dog.";
		System.out.println("Original string : " +str);
		
		String newStr = str.replace('o', 'd');
		System.out.println("'o' replaced in string with 'd' : " +newStr);
		
		newStr = str.replace("dog", "cat");
		System.out.println("\"dog\" replaced in string with \"cat\" : " +newStr);
		
		newStr = str.replaceAll("dog", "cat");
		System.out.println("\"dog\" replaced in string with \"cat\" : " +newStr);
		
		newStr = str.replaceFirst("dog", "cat");
		System.out.println("First word \"dog\" replaced in string with \"cat\" : " +newStr);
	}
}