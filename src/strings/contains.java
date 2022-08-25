package strings;

public class contains {
	public static void main(String[] args) {
		String str = "PHP Exercises and HTML Exercises";
		String s = "and";
		System.out.println("Specified sequence of char values: " +s);
		
		boolean check = str.contains(s);
		
		if(check) {
			System.out.println("TRUE : String contains the specified sequence of char values");			
		}
		else {
			System.out.println("FALSE : String does not contains the specified sequence of char values");
		}

	}
}