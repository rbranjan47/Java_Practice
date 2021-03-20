package raBi;

class Inheritance_Animal_nature
{
	void nature()
	{
		System.out.println("These all are behaviour of animals.");
	}
}

class dog extends Inheritance_Animal_nature
{
	void say()
	{
		System.out.println("Dog is BARKING");
	}
}

class goat extends dog
{
	void behaviour()
	{
		System.out.println("Goat is MEMING");
	}
}

class sparrow extends goat
{
	void speak()
	{
		System.out.println("Sparrow doing CHU-CHU");
	}
}
public class Inheritance_Animal
{
	public static void main(String[] args) 
	{
		sparrow s=new sparrow();
		s.behaviour();
		s.speak();
		s.say();
		s.nature();
		
	}

}
