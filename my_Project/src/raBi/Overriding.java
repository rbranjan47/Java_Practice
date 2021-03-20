package raBi;

class engineer
{
	void work()
	{
		System.out.println("ENGINEER'S WORK");
	}
}

class softwareengineer extends engineer
{
	void work()
	{
		System.out.println("developing software");
	}
}

class electricalengineer extends engineer
{
	void work()
	{
		System.out.println("producing electricity and electrical equipment");
	}
}

class mechanicalengineer extends engineer
{
	void work()
	{
		System.out.println("manufacturing automobile");
	}
}

public class Overriding
{

	public static void main(String[] args) 
	{
		mechanicalengineer m=new mechanicalengineer();
		m.work();
		
		electricalengineer e=new electricalengineer();
		e.work();
		
		softwareengineer s=new softwareengineer();
		s.work();
		
		engineer en=new mechanicalengineer();
		en.work();
	}

}
