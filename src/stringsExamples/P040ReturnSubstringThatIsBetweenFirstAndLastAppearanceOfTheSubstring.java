//Return the substring that is between the first and last appearance of the substring 'toast' in the given string,
//or return the empty string if substirng 'toast' does not exists.
//Given string = sweettoastbuttertoast
//Given substring = toast
//New string = butter

package stringsExamples;

public class P040ReturnSubstringThatIsBetweenFirstAndLastAppearanceOfTheSubstring {
	public static void main(String[] args) {
		String str = "sweettoastbuttertoast";
		String subStr = "toast";
		System.out.println("Given string = " + str + "\nGiven substring = " + subStr);
		if (str.contains(subStr)) {
			int len = str.length();
			String tmpStr = "", newStr = "";
			int[] arr = new int[2];
			int count = 0;
			for (int i = 0; i < len-4; i++) {
				tmpStr = str.substring(i, i+5);
				if(tmpStr.endsWith(subStr)) {
					arr[count] = i;
					count++;
				}
			}
			newStr = str.substring(arr[0]+5, arr[1]);
			System.out.println("New string = " +newStr);
		} 
		else {
			System.out.println("the string \"" + str + "\" does not contains the substring \"" + subStr + "\"");
		}
	}
}