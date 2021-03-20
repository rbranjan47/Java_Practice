package raBi;

import java.util.Stack;

public class Stack_Demo 
{

	public static void main(String[] args)
	{
		Stack<String> stack1=new Stack<String>();
		stack1.push("Rabi");
		stack1.add("Ranjan");
		stack1.push("kumar");
		
		System.out.println("peek/top element on stack is "+stack1.peek());
		
		//searching- kumar
		System.out.println(""+stack1.search("kumar"));
		
		//if it is not present it will return -1
		System.out.println(" "+stack1.search("patel"));
		
		//printing all object
		System.out.println("objects "+stack1);
		
		//deleting first element, i.e. LIFO (top element)
		stack1.pop();
		//deleting second element, i.e. LIFO (top element)
		stack1.pop();
		//checking it is deleted or not
		System.out.println(stack1.empty());
		System.out.println("objects "+stack1);
		
		stack1.pop();
		//
		System.out.println(stack1.empty());
	}

}
