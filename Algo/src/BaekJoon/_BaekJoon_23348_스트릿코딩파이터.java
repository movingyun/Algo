package BaekJoon;

import java.util.Scanner;

public class _BaekJoon_23348_스트릿코딩파이터 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[3];
		for (int i = 0; i < 3; i++) {
			score[i] = sc.nextInt();
		}
		int team = sc.nextInt();
		int max = 0;
		for (int tc = 0; tc < team; tc++) {
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					sum += sc.nextInt() * score[j];
				}
			}
			if (sum > max)
				max = sum;
		}
		System.out.println(max);
	}
}
