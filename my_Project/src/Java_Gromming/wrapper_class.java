package Java_Gromming;

public class wrapper_class {
	public static void main(String[] args) {
		int a = 20;
		
		//converting into String
		String s = String.valueOf(a);
		System.out.println(s);
		
		//getting data-type of a
		System.out.println(((Object)a).getClass().getSimpleName());  //it will give only the name
		
		System.out.println(((Object)a).getClass().getName());  //it will give tha name along with the library name
		//Now, getting the data-type of s
		System.out.println(s.getClass().getSimpleName());
		
		//converting String into double
		double d = Double.valueOf(s);
		System.out.println(d);
		
		//getting data-type of d
		System.out.println(((Object)d).getClass().getSimpleName());
	}
}
