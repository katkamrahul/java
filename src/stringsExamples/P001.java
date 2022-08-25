//Input = aaabbccacbbaacb		Output = 1a2a3a1b2b1c2c4a3c3b4b5a6a4c5b

package stringsExamples;

public class P001 {
	public static void main(String[] args) {
		String str = "aaabbccacbbaacb";
		int len = str.length();
		int x = 1, y = 1, z = 1, count = 0;
		char[] arr = new char[len*2];
		for(int i=0; i<len; i++)
		{
			if(str.charAt(i)=='a') {
				char c = (char)(x + '0');
				arr[count] = c;
				count++;
				x++;
				arr[count]=str.charAt(i);
				count++;				
			}
			if(str.charAt(i)=='b') {
				char c = (char)(y + '0');
				arr[count] = c;
				count++;
				y++;
				arr[count]=str.charAt(i);
				count++;				
			}
			if(str.charAt(i)=='c') {
				char c = (char)(z + '0');
				arr[count] = c;
				count++;
				z++;
				arr[count]=str.charAt(i);
				count++;				
			}
		}
		String newStr = new String(arr);
		System.out.println("Old String : " +str);
		System.out.println("New String : " +newStr);
	}
}