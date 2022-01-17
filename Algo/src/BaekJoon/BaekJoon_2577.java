package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a * b * c;
		int x = 0;

		int[] num = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		if ((result / 100000000) > 0) {
			x = 9;
		}

		else if ((result / 10000000) > 0) {
			x = 8;
		} else {
			x = 7;
		}

		int[] arr = new int[x];

		for (int i = 0; i < 9; i++) {
			arr[i] = result % 10;
			result = result / 10;
			if (result == 0) {
				break;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			num[arr[i]]++;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}