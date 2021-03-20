package Qspider_1;

public class project 
{
	String project="java";
    String submit_date="1-Aug-2020";
    String name="raju";
    
    void develop_project()
    {
    	System.out.println(name+" "+project + " "+ submit_date);
    }

	public static void main(String[] args) 
	{
		project p1=new project();
		p1.develop_project();

	}

}
