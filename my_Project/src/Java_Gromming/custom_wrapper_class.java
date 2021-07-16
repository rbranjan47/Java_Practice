package Java_Gromming;

public class custom_wrapper_class 
{
	private int i;  //private variable to not get called in another class by inheriting
	
	//calling constructor
	public custom_wrapper_class(int i) {
		this.i = i;  
	}
	
	//using getter and setter method to get change into string
	public int get_value(int i) {
		return i;
	}
	
	public void set_value(int i) {
		this.i = i;
	}
	
	//now, override the interger with string
	@Override
	public String toString() {
		return Integer.toString(i);
	}
	
	public static void main(String[] args)
	{
		
		//boxing
		custom_wrapper_class wrap = new custom_wrapper_class(10);
		System.out.println(wrap);
		//getting data-type
		System.out.println(wrap.getClass().getTypeName());
		
		//unboxing
		int value = wrap.get_value(10);
		System.out.println(value);
		//data-type
		System.out.println(((Object)value).getClass().getSimpleName());
	}
	
}
