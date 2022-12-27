package Java_Gromming;

/*
 * >>>> Ability to display messages 
 * 
 * >> Compile time polymorphism
 *       --Static Polymorphism, achieved by Function/Operator overloading
 *       
 *       
 * >> Run time polymorphism
 *       --Dynamic method dispatch, achieved by Method(function) overiding
 */

class polymorphismHelper {
	static int multiply(int a, int b) {
		return a * b;
	}

	// method overload
	static double multiply(double a, double b) {
		return a * b;
	}
}

public class polyMorphismConcept {

	public static void main(String[] args) {
		//int method
		System.out.println(polymorphismHelper.multiply(2, 5));
		System.out.println(polymorphismHelper.multiply(2.5, 5.5));
	}
}
