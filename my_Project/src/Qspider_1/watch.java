package Qspider_1;

public class watch 
{
 void work()
 {
	 System.out.println("This is watch and display time");
	 
 }
}
 
  class smartwatch extends watch
  {
	  void work()
 {
	System.out.println("this watch diplay work and time");
 }
	  
	public static void main(String[] args) 
	{
		watch w1=new watch();
		System.out.println(w1);
	}

}
