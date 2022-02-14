package SWEA;

import java.util.Scanner;

public class SWEA_1926_간단한369 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			int num = i;
			if (num / 10 == 0) {
				if (num == 3 || num == 6 | num == 9)
					System.out.print("- ");
				else
					System.out.print(num + " ");
			} else {
				if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
					if (num % 10 == 3 || num % 10 == 6 | num % 10 == 9)
						System.out.print("-- ");
					else
						System.out.print("- ");
				} else if (num % 10 == 3 || num % 10 == 6 | num % 10 == 9)
					System.out.print("- ");
				else
					System.out.print(num + " ");
			}
		}
	}
}
