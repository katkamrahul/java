package strings;

public class trim {
	public static void main(String[] args) {
		String str = "      Java Exercises     ";
		System.out.println("Given String : " +str);
		
		str = str.trim();
		System.out.println("String after removing leading or trailing whitespace : " +str);
	}	
}