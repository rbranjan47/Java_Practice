package InterviewQuestions;

public class JavaClassesImp {
	//JVM will execute static block first before main method, even in any order 
	static{
		System.out.println("Block 1");
	}
	
	static{
		System.out.println("Block 2");
	}
	public static void main(String[] args) {
//		Main mains = new Main();

		System.out.println("main method ---hello world");
	}
	
	static{
		System.out.println("Block 3");
	}
	
	//Parameters limits in methods, for ****int, short, boolean float, class type 254(non-static) and 255(static)
	
	//for ****double and long   127(for both non-static and static)
}

class Main { 
	public static final int x = 100;
	static {
		System.out.println("main class --- static block");
	}
}
