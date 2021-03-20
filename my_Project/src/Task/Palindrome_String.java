package Task;

public class Palindrome_String 

{
	static boolean isPalindrome(String st)
	 {
	  char ch[]=st.toCharArray();
	
		String rv="";
	  for(int i=ch.length-1;i>=0;i--)
		rv=rv+ch[i];		

		if(rv.equals(st))
		  return true;
		else
		  return false;
	 }

	public static void main(String[] args) 
	{

	}

}
