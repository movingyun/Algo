package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_6913_D3_동철이의프로그래밍대회 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] person = new int[N];
			for (int j = 0; j < N; j++) {
				for (int i = 0; i < M; i++) {
					int sol = sc.nextInt();
					if (sol == 1) {
						person[j]++;
					}
				}
			}
			int max = -1;
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if (person[i] > max) {
					max = person[i];
				}
			}
			for (int i = 0; i < N; i++) {
				if (person[i] == max) {
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt + " " + max);
		} // tc
	} // main
}
