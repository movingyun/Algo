package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1157_단어공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] result = new int[100];
		String str = sc.next();
		String str_up = str.toUpperCase();

		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str_up.charAt(i);
		}

		for (int i : arr)
			result[i] += 1;

		int max = -1;
		int max_loc = 0;
		for (int i = 0; i < 100; i++) {
			if (result[i] > max) {
				max_loc = i;
				max = result[i];
			}
			else if (max == result[i]) {
				max_loc = (int)'?';
			}
		}
		System.out.println((char) max_loc);
	}
}
