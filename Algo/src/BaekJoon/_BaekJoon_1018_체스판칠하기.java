package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

// W로 시작하는거랑 B로 시작하는거 2개의 answer만들어두고
// 8x8로 고를수 있는 모든 경우의수에서
// answer랑 가장 차이가 적은 거 선택!
public class _BaekJoon_1018_체스판칠하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[][] map = new char[a][b];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a; i++) {
			String s = sc.next();
			map[i] = s.toCharArray();
		}
		char[][] answer1 = new char[8][8];
		char[][] answer2 = new char[8][8];
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0) {
				answer1[i] = "WBWBWBWB".toCharArray();
				answer2[i] = "BWBWBWBW".toCharArray();
			} else {
				answer2[i] = "WBWBWBWB".toCharArray();
				answer1[i] = "BWBWBWBW".toCharArray();
			}
		}
		for (int i = 0; i <= a - 8; i++) {
			for (int j = 0; j <= b - 8; j++) {
				int cnt1 = 0;
				int cnt2 = 0;
				int x = 0;
				for (int q = i; q < i + 8; q++) {
					int y = 0;
					for (int k = j; k < j + 8; k++) {
						if (map[q][k] != answer1[x][y])
							cnt1++;
						if (map[q][k] != answer2[x][y])
							cnt2++;
						y++;
					}
					x++;
				}
				min = Math.min(min, Math.min(cnt1, cnt2));
			}
		}
		System.out.println(min);
	}
}
