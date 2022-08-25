package strings;

public class hashCode {
	public static void main(String[] args) {
		String str = "Python Exercises.";

		int hashCode = str.hashCode();			// Get the hash code for the above string.
												// It creates a unique identifier of a given string.

		System.out.println("The hash for " +str+ " is " + hashCode);
	}
}