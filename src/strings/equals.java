package strings;

public class equals {
	public static void main(String[] args) {
		String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";
        String columnist4 = "Stephen Edwin King";

        boolean equals1 = columnist1.equals(columnist2);
        boolean equals2 = columnist1.equals(columnist3);
        boolean equals3 = columnist1.equals(columnist4);
        
        System.out.println("\"" + columnist1 + "\" equals \"" +columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" +columnist3 + "\"? " + equals2);
        System.out.println("\"" + columnist1 + "\" equals \"" +columnist4 + "\"? " + equals3);
	}
}