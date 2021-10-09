package Practice;

import java.util.Scanner;

public class hr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");

		String str = sc.nextLine();
		String[] strSplit = str.split(" ");
		String alphabet = strSplit[0];
		String number = strSplit[1];
		int numberInt = Integer.parseInt(number);
		
		
		int alpcount = 0;
		for (int i = 0; i < alphabet.length(); i++) {
			char ch = alphabet.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				alpcount++;
				if (alpcount <= 10 && numberInt >=0 && numberInt <= 999) {
					if(numberInt<100) {
						System.out.println(alphabet +"\t"+ numberInt);
					}
					else {
						System.out.println(alphabet +"\t"+ numberInt);
					}
				}
				else {
					System.out.println("need to trim alphabet");
				}
			}
			else  {
				System.out.println("enter any string with integer");
			}
		}
		sc.close();
	}
}
