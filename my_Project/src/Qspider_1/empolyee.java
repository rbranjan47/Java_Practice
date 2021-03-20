package Qspider_1;

public class empolyee 
{
	int id,salary;
	String name,dept;
	
	empolyee(int id,int salary,String name,String dept)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.dept=dept;
	}
	public static void main(String[] args) 
	{
		empolyee e1=new empolyee(123,10000,"rabi"+"   ","mechanical");
		System.out.println(e1.id+e1.salary+e1.name+e1.dept);
		
		empolyee e2=new empolyee(234,12000,"rajan","computer science");
		System.out.println(e2.id+e2.salary+e2.name+e2.dept);

	}

}
