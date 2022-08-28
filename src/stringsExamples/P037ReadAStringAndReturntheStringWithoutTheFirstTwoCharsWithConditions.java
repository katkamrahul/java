//Read a string and return the string without the first two characters.
//Keep the first character if it is 'g' and keep the second character if it is 'h'.
//String 1 = coat		String 2 = goat		String 3 = photo		String 4 = ghost
//New string = at		New string = gat	New string = hoto		New string = ghost

package stringsExamples;

public class P037ReadAStringAndReturntheStringWithoutTheFirstTwoCharsWithConditions {
	public static void main(String[] args) {
		String[] arr = {"coat", "goat", "photo", "ghost"};
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			System.out.println("String " +count+ " = " +str);
			if(str.charAt(0)!='g' && str.charAt(1)!='h') {
				System.out.println("New String = " +str.substring(2, str.length()));
				count++;
			}
			else if(str.charAt(0)=='g' && str.charAt(1)!='h') {
				System.out.println("New String = " +(str.substring(0,1)+str.substring(2, str.length())));
				count++;
			}
			else if(str.charAt(0)!='g' && str.charAt(1)=='h') {
				System.out.println("New String = " +(str.substring(1,str.length())));
				count++;
			}
			else {
				System.out.println("New String = " +str);
				count++;
			}
		}
	}
}