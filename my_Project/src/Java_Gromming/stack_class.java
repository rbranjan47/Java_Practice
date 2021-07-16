package Java_Gromming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class stack_class {
	public static void odd_even(int arr[], int upto_n) {
		int oddInd = 1;
		int evenInd = 0;
		
		while(true) {
			while(evenInd <upto_n && arr[evenInd] %2 == 0)
				evenInd=evenInd+2;
			
			while(oddInd<upto_n && arr[oddInd] %2 ==1)
				oddInd = oddInd+2;
			
			if (evenInd < upto_n && oddInd <upto_n)
				{
				int temp = arr[evenInd];
				arr[evenInd] = arr[oddInd];
				arr[oddInd] = temp;
				}
			else 
				break;
		}
	}
	
	
	public static void main(String[] args) {
		List<Integer>  stack = new ArrayList<Integer>();
		int a=20;
		for (int i=0; i<a; i++) {
			stack.add(i);
		}
		//printing all values which comes in array
		System.out.println(stack);
		
		//array conversion, 
		Integer[] list_arrays = new Integer[](stack.size());
		
		stack_class stack_fun = new stack_class();
		stack_fun.odd_even(values_array, a);
	}
}
