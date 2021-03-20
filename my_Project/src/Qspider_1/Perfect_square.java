package Qspider_1;

import java.util.Scanner;

public class Perfect_square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an integer: ");

		int n = sc.nextInt();

		for (int i = 1; i < n; i++) 

			if (n == i * i)

				System.out.println(n + " is a perfect Square");

		sc.close();
	}
}
