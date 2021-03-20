package Qspider_1;

public class car   //class
{
		String Colour="Red";
	    int Price=500000;
	    String Model="Alto";
	    
	    void car_details()   //behaviour
	    {
	    	System.out.println(Colour +" "+Price+" "+Model);
	    }
	    void startcar()     //behaviour
	    {
	    	System.out.println("insert key and start car");
	    }
	    
	    void playmusic()  //behaviour
	    {
	    	System.out.println("play the music");
	    }
	    void changegear()  //behaviour
	    {
	    	System.out.println("change the gear a/c to your reuirement");
	    }

	public static void main(String[] args) 
	{
	
	car c1=new car();    //object with refrence c1
	c1.car_details();
	c1.startcar();
	c1.playmusic();
	c1.changegear();

	}

}
