package strings;

public class equalsIgnoreCase {
	public static void main(String[] args) {
		String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "STEPHEN EDWIN KING";

        boolean equals1 = columnist1.equalsIgnoreCase(columnist2);
        boolean equals2 = columnist1.equalsIgnoreCase(columnist3);
        
        System.out.println("\"" + columnist1 + "\" equals by ignoring case \"" +columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals by ignoring case\"" +columnist3 + "\"? " + equals2);
	}
}