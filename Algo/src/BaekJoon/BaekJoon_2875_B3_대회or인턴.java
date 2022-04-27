package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2875_B3_대회or인턴 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		int result = 0;
		for (int i = 0; i <= c; i++) {
			int g = i;
			int m = c - i;
			result = Math.min((a - g) / 2, (b - m));
			if (max < result)
				max = result;
		}
		System.out.println(max);
	}
}
