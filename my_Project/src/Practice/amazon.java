package Practice;

import java.util.Scanner;

public class amazon {

	public static void main(String[] args) {
		int z;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		z = sc.nextInt();
		System.out.println("Size of array is " + z);

		// defined array
		int[] array = new int[z - 1];
		System.out.println("enter array Elements: ");
		for (int i = 0; i < z - 1; i++) {
			array[i] = sc.nextInt();
		}

		int sumArray = 0;
		for (int i = 0; i < z - 1; i++) {
			sumArray = sumArray + array[i];
		}

		

		// orginal number sum
		int sumTotal = ((z) * (z + 1)) / 2;
		System.out.println("sum of array elements are:" + sumArray);
		System.out.println("sum of array elements are:" + sumTotal);
		System.out.println();
		int missingNumber = sumTotal - sumArray;
		
		System.out.println("missing number is: " + missingNumber);
	}
}
