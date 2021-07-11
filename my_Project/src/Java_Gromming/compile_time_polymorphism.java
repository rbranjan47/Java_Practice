package Java_Gromming;

public class compile_time_polymorphism {
	//compile time polymorphism is also known as Method overloading
	//When there are multiple methods with same name but different parameters  
	public int multiply(int a, int b) {
		int c = a*b;
		return c;
	}
	
	public int multiply(int a, int b, int c) {
		int d = a*b*c;
		return d;
	}
	
	public double multiply(int f, double e) {
		double mul = f*e;
		return mul;
	}
	
	public static void main(String[] args)
	{
		compile_time_polymorphism obj = new compile_time_polymorphism();
		
		System.out.println(obj.multiply(2, 3));;
		System.out.println(obj.multiply(2, 3, 4));
		System.out.println(obj.multiply(3, 3.33));
	}
}
