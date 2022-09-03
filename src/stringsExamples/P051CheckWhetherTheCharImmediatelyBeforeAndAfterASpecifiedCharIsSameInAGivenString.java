 //Check whether the character immediately before and after a specified character is same in a given string.
//Given string = moon#night						Given string = bat##ball						Given string = #moon#night
//Are before & after characters same : true		Are before & after characters same : false		Are before & after characters same : true

package stringsExamples;

public class P051CheckWhetherTheCharImmediatelyBeforeAndAfterASpecifiedCharIsSameInAGivenString {
	public static void main(String[] args) {
		String[] arr = {"moon#night", "bat##ball", "#moon#night"};
		for(int i=0; i<arr.length; i++) {
			System.out.println("Given String : " +arr[i]);
			boolean check = false;
			for(int j=1; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == '#') {
					if(arr[i].charAt(j-1) == arr[i].charAt(j+1)) {
						check = true;
					}
				}
			}
			if(check) {
				System.out.println("Are before & after characters same : TRUE");
			}
			else {
				System.out.println("Are before & after characters same : FALSE");
			}
		}
	}
}