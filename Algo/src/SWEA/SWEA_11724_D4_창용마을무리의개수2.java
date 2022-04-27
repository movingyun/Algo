package SWEA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_11724_D4_창용마을무리의개수2 {

	static int[] p;
	static int M, N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			p = new int[N + 1];

			for (int i = 0; i < N + 1; i++) {
				makeSet(i);
			}

			for (int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				union(a, b);
			}
			int cnt = 0;
			for (int i = 1; i < N + 1; i++) {
				if (p[i] == i)
					cnt++;
			}
			System.out.println("#" + tc + " " + cnt);
		}//tc함수
	}// main 함수

	public static void makeSet(int x) {
		p[x] = x;
	}
	public static int findSet(int x) {
		if (x == p[x])
			return x;
		else
			return findSet(p[x]);
	}
	public static void union(int x, int y) {
		p[findSet(y)] = findSet(x);
	}
}
