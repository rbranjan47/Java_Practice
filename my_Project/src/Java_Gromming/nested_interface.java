package Java_Gromming;

class test
{
	interface nested_interface_test
	{
		void testing();
	}
}

class test_implement implements test.nested_interface_test
{
	public void testing()
	{
		System.out.println("nested interface methods are public, default, protected but not private");
	}
}

public class nested_interface 
{
	public static void main(String[] args)
	{
		test.nested_interface_test obj;
		test_implement t = new test_implement();
		//showing objects of nested interface and implemented class are equal
	     obj = t;
		obj.testing();
	}
}
