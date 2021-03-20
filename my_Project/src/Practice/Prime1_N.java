package Practice;

import java.util.Scanner;

public class Prime1_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the range");
		int num = sc.nextInt();

		for (int i = 1; i < num; i++) {
			boolean isprime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime)
				System.out.println(i + " ");
		}

		sc.close();

	}

}
