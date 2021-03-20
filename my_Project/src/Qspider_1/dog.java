package Qspider_1;

public class dog
{
 double height=2.4; // global variable---->state of dog
 
 //behavior
 void jump()
 {
	 double height=5.1;  //local variable
	 System.out.println(this.height + "and another height is" + height);
 }
	public static void main(String[] args)
	{
		dog d=new dog();
		d.jump();

	}

}
