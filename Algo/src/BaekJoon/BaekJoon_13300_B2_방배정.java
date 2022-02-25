package BaekJoon;

import java.util.Scanner;

public class BaekJoon_13300_B2_방배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] man = new int[6];
		int[] woman = new int[6];
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 여자 0 남자 1
		for (int i = 0; i < a; i++) {
			int gen = sc.nextInt();
			int gra = sc.nextInt();
			if (gen == 0)
				woman[gra - 1]++;
			else if (gen == 1)
				man[gra - 1]++;
		}
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			sum += (man[i] + b - 1) / b;
			sum += (woman[i] + b - 1) / b;
		}
		System.out.println(sum);

	}
}
