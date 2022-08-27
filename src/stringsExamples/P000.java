package stringsExamples;

public class P000
{
	public static void main(String args[])
	{
		 String MyString = "Hello World"; 
	     System.out.println("The string before removing character: " + MyString); 
	     MyString = MyString.replace("W", ""); 
	     System.out.println("The string after removing character: " + MyString);
	}
}