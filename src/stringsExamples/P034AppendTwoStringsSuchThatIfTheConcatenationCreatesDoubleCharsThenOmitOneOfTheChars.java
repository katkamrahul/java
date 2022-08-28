//Write a Java program to append two given strings such that, 
//if the concatenation creates double characters then omit one of the characters.
//String 1 = food
//String 2 = door
//String after concatenation = foodoor

package stringsExamples;

public class P034AppendTwoStringsSuchThatIfTheConcatenationCreatesDoubleCharsThenOmitOneOfTheChars {
	public static void main(String[] args) {
		String str1="food", str2="door", newStr="";
		System.out.println("String 1 = " +str1);
		System.out.println("String 2 = " +str2);
		newStr = str1.concat(str2);
		if(newStr.length()==(str1.length()*2)) {
			char c = str1.charAt(str1.length()-1);
			String str = Character.toString(c);
			newStr = str1.replace(str, "").concat(str2);
			System.out.println("String after concatenation = " +newStr);
		}
		else {
			System.out.println("String after concatenation = " +newStr);
		}
	}
}