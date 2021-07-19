package Java_Gromming;

import java.util.Enumeration;
import java.util.Stack;

public class stack_class {
	/*
	 * public static void odd_even(int arr[], int upto_n) { int oddInd = 1; int
	 * evenInd = 0;
	 * 
	 * while(true) { while(evenInd <upto_n && arr[evenInd] %2 == 0)
	 * evenInd=evenInd+2;
	 * 
	 * while(oddInd<upto_n && arr[oddInd] %2 ==1) oddInd = oddInd+2;
	 * 
	 * if (evenInd < upto_n && oddInd <upto_n) { int temp = arr[evenInd];
	 * arr[evenInd] = arr[oddInd]; arr[oddInd] = temp; } else break; } }
	 */

	// pushing element on the top of the stack
	public static void stack_push(Stack<Integer> stack) 
	{
		for (int i = 0; i < 5; i++) 
		{
				stack.push(i);
		}
		//System.out.println(stack);
	}

	// pusing element from the top of the stack
	public static void stack_pop(Stack<Integer> stack) 
	{
		System.out.println("Pop Operations");
		
		for (int i=0; i<5 ; i++) 
		{
			Integer value = (Integer) stack.pop(); //  It will  pop all the elements
			System.out.println(value);
		}
	}
	
	//peeking element
	public static void stack_peek(Stack<Integer> stack)
	{
		Integer element = (Integer) stack.peek();
		System.out.println("Element on top of stack "+element);
	}
	
	public static void stack_search(Stack<Integer> stack, int element) 
	{
		Integer position = (Integer) stack.search(element);
		
		if(position == -1)
		{
			System.out.println("element not found");
		}
		else {
			System.out.println("element :"+position);
		}
	}
	
	public static void main(String[] args)
	{

		Stack<Integer> stack = new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		//again inserting the values in the stack
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 0);  //element number 5, as per last in Fist out
		stack_search(stack, 4);  //element number 1, as per last in Fist out
		stack_search(stack, 8);
		
		//we can also use list methods, as it is implementing list interface
		stack.add(90);
		stack.add(91);
		stack.add(92);
		stack.add(88);
		System.out.println(stack);
		
		//enumarations 
		Enumeration<Integer> emr = stack.elements();
		System.out.println("Enumerations: ");
		while(emr.hasMoreElements())
		{
			System.out.println(emr.nextElement());
		}
	}
}

