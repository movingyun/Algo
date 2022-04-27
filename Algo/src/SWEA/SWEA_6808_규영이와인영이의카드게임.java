package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_6808_규영이와인영이의카드게임 {

	static int[] kyu;
	static int[] in;
	static int win;
	static int lose;
	static int[] result;
	static int[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			kyu = new int[9]; // 규영이 카드
			for (int i = 0; i < 9; i++) {
				kyu[i] = sc.nextInt();
			}
			result = new int[9];
			visit = new int[9];
			in = new int[9]; // 인영이 카드
			int idx = 0;
			for (int i = 1; i <= 18; i++) {
				int flag = 1;
				for (int j = 0; j < 9; j++) {
					if (kyu[j] == i)
						flag = 0;
				}
				if (flag == 1) {
					in[idx++] = i;
				}
			}
			win = 0; lose = 0;
			per(0);
			System.out.printf("#%d %d %d\n", tc, win, lose);
		} // tc끝
	}// main끝

	static int cnt = 0;

	public static void per(int dept) {
		// 끝내
		if (dept >= 9) {
			int kyuScore = 0;
			int inScore = 0;
			for (int i = 0; i < 9; i++) {
				if (kyu[i] > result[i]) {
					kyuScore += (kyu[i] + result[i]);
				} else {
					inScore += (result[i] + kyu[i]);
				}
			}
			if (kyuScore > inScore) {
				win++;
			} else {
				lose++;
			}
			return;
		}

		// 재귀
		for (int i = 0; i < 9; i++) {
			if (visit[i] == 1)
				continue;
			else {
				visit[i] = 1;
				result[dept] = in[i];
				per(dept + 1);
				visit[i] = 0;
			}
		}
	}
}
