package Task;

import java.util.Scanner;

public class Prime_Array 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
         System.out.println("enter the size: ");
         int size=sc.nextInt();
         
	    System.out.println("Enter the elements of the array: ");
	    
	    int array[]=new int[size];
	    for(int i=0; i<size; i++)
	    {
	       array[i]=sc.nextInt();
	    }  
	
	    for(int i=0; i<array.length; i++){
	        boolean isPrime = true;

	        for (int j=2; j<i; j++){

	            if(i%j==0){
	                isPrime = false;
	                break;
	            }
	        } 
	        if(isPrime)

	            System.out.println(i + " are the prime numbers in the array ");
	    }

	    sc.close();
	}

}
