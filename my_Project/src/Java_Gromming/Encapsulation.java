package Java_Gromming;
/*
 * Encapsulation: Wrapping up of data under a single unit
 * >> Data Hiding & Abstractions
 * >> Reuasability
 * >> Variables are Read only & Write Only, increase flexibility 
 * >> Easy for unit testing
 */
class Encapsulate{
	//declaring the variables in private and methods in public
	private  String name;
	private int number;
	private  double percentage;
	
	public String get_name_method() {
		return name;
	}
	
	public double get_percentage_method() {
		return percentage;
	}
	
	public int get_number_method() {
		return number;
	}
	
	public void set_name_method(String new_name) {
		name = new_name;
	}
	public void Set_number_method(int new_number) {
		 number = new_number;
	}
	
	public void set_percentage_method(double new_percentage) {
		percentage = new_percentage;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
		obj.Set_number_method(12);
		obj.set_name_method("Rabi Ranjan Kumar");
		obj.set_percentage_method(89.98);
		
		// Displaying values of the variables
		System.out.println("Name:"+obj.get_name_method());
		System.out.println("Number:"+obj.get_number_method());
		System.out.println("Percentage:"+obj.get_percentage_method());
	}
}
