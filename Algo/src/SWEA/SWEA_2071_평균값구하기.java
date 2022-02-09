package SWEA;

import java.util.Scanner;

public class SWEA_2071_평균값구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		

		for (int tc = 1; tc <= T; tc++) {
			double sum = 0;
			int[] arr = new int[10];
			for (int i = 0; i < 10; i++) {
				sum += sc.nextInt();
			}
			
			System.out.println("#"+tc+" "+Math.round(sum/10));
		}
	}
}
