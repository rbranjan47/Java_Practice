package Qspider_1;

public class Strings1 
{
	

	public static void main(String[] args) 
	{
		String s1="";
		for (int i=1;i<=10;i++)
		{
			//s1=s1+i;
			s1=i+s1;
		}
		System.out.println("sum is: "+s1);

	}

}

/*
s1=""-----""
s1=1+""----"1"
s1=2+"1"-----"21"
s1=3+"21"-----"321"
s1=4+"321"-----"4321"
s1=5+"4321"-----"54321"
...................
s1=10+"987654321"-------"10987654321" (output)----10987654321  */
