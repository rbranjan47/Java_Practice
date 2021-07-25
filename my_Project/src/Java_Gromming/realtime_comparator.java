package Java_Gromming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class employee implements Comparable<employee>
{
	private String name;
	private int year;
	private int id;
	private double salary;
	
	//creating constructor
	public employee(String name, int year, int id, double salary)
	{
		this.name = name;
		this.year = year;
		this.id = id;
		this.salary = salary;
	}
	
	@Override //comapring salary
	public int compareTo(employee e) 
	{
		return (int) (this.salary-e.salary);
	}
	
	//getting access of private methods
		public String emp_name() {
			return name;
		}
		
		public int emp_year() {
			return year;
		}
		
		public int emp_id() {
			return id;
		}
		
		public double emp_salary() {
			return salary;
		}

		
}

//year compare
class compareYear implements Comparator<employee>
{
	@Override
	public int compare(employee e1, employee e2)
	{
		if(e1.emp_year()>e2.emp_year()) return 1;
			
		if(e1.emp_year()<e2.emp_year()) return -1;
			
		else return 0;
			
	}
}

//name compare
class compareName implements Comparator<employee>
{
	public int compare(employee e1, employee e2)
	{
		return e1.emp_name().compareTo(e2.emp_name());
	}

	
}


class realtime_comparator 
{
	public static void main(String[] args)
	{
		ArrayList<employee> list = new ArrayList<employee>();
		list.add(new employee("james", 2020, 101, 25000));
		list.add(new employee("stokes", 2024, 191, 15000));
		list.add(new employee("mark", 2005, 11, 40000));
		list.add(new employee("stonis", 2007, 91, 32000));
		list.add(new employee("sami", 2015, 101, 27000));
		list.add(new employee("ronald", 2021, 101, 15000));
		
		
		/* by iterator
		ListIterator<employee> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} */
		
		//sorted by salary
		System.out.println("Sorted by salary: ");
		Collections.sort(list);
		for(employee emp : list)
		{
			System.out.println(emp.emp_year());
		}
		
		//sorted by year
		System.out.println("Sorted by year: ");
		compareYear cmp_year = new compareYear();
		Collections.sort(list, cmp_year);
		for(employee emp_cmp_year : list)
		{
			System.out.println(emp_cmp_year.emp_year());
		}
		
		//sorted by name
		System.out.println("Sorted by name: ");
		compareName cmp_name_year = new compareName();
		Collections.sort(list, cmp_name_year);
		for(employee emp: list)
		{
			System.out.println(emp.emp_name());
		}
	}
}
