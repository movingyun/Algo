package BaekJoon;

import java.util.Scanner;

public class BaekJoon_11048_S1_이동하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] sumArr = new int[r+1][c+1];
		
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				int max = Math.max(sumArr[i-1][j],sumArr[i][j-1]);
				max+=sc.nextInt();
				sumArr[i][j] = max;
			}
		}
		System.out.println(sumArr[r][c]);
	}
}
