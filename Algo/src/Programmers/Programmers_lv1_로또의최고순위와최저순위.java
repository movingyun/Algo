package Programmers;

import java.util.Scanner;

public class Programmers_lv1_로또의최고순위와최저순위 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lottos = new int[6];
		for (int i = 0; i < 6; i++) {
			lottos[i] = sc.nextInt();
		}
		int[] win_nums = new int[6];
		for (int i = 0; i < 6; i++) {
			win_nums[i] = sc.nextInt();
		}
		int zero = 0;
		int score = 1;
		for (int i = 0; i < 6; i++) {// 내가 선택
			int cnt = 0;
			if (lottos[i] == 0) {
				zero++;
				continue;
			}
			for (int j = 0; j < 6; j++) {// 답지
				if (lottos[i] == win_nums[j]) {
					cnt++;
					break;
				}
			}
			if (cnt == 0)
				score++;
		}
		if (score > 6)
			score = 6;

		int max = score;
		int min = score + zero;

		if (score > 6)
			score = 6;
		
		System.out.println(max);
		System.out.println(min);
	}
}
