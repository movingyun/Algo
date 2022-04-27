package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_4012_요리사 {

	// n개 중 조합으로 nCn/2뽑고 차이의 최소값을 저장
	static int[][] map;
	static int min, n, pick;
	static int p1Score, p2Score;
	static int[] p1, p2;
	static boolean[] seq;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			n = sc.nextInt();
			pick = n / 2;
			map = new int[n][n];
			p1 = new int[pick];
			p2 = new int[pick];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			// p1배열 찾기
			min = Integer.MAX_VALUE;
			selectIn(0, 0);
			System.out.println("#"+tc+" "+min);
		} // tc끝
	}// main끝

	// 선수뽑기(조합)
	public static void selectIn(int dept, int start) {
		if (dept == pick) {
			seq = new boolean[n];
			for(int i=0; i<pick; i++) {
				seq[p1[i]-1] = true;
			}
			int idx=0;
			for(int i=0; i<n; i++) {
				if(!seq[i]) {
					p2[idx++] = i+1;
				}
			}
			p1Score = score(p1);
			p2Score = score(p2);
//			System.out.print("p1 : " + Arrays.toString(p1) + " p1Score : " + p1Score + "\n");
//			System.out.print("p2 : " + Arrays.toString(p2) + " p2Score : " + p2Score + "\n");
			if(Math.abs(p1Score-p2Score)<min) min = Math.abs(p1Score-p2Score);
			return;
		}

		for (int i = start; i < n; i++) {
			p1[dept] = i + 1;
			selectIn(dept + 1, i + 1);
		}
	}//selectIn함수 끝

	// 점수 구하기
	public static int score(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i==j) continue;
				sum+=map[arr[i]-1][arr[j]-1];
			}
		}
		return sum;
	}
}
