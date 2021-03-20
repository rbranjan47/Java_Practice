//WAJP to print prime number


package Practice;

import java.util.Scanner;

public class Prime1_N_a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range: ");

		int num = sc.nextInt();
		for (int i = 1; i < num; i++) {
			boolean isPrime = true;
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					isPrime = false;
				break;
			}
		}
			if (isPrime) 
			
				System.out.println(i + " ");
		}
		sc.close();

	}
}
