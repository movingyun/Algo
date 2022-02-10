package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1204_최빈수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			sc.nextInt();
			int[] score = new int[1000];
			int[] arr = new int[101];
			for (int i = 0; i < 1000; i++) {
				score[i] = sc.nextInt();
				arr[score[i]]++;
			}
			int max=0;
			int result=0;
			for(int i =0; i<101; i++) {
				if(arr[i]>=max) {
					max=arr[i];
					result=i;
				}
					
			}
			System.out.printf("#%d %d\n", tc, result);
		}
	}
}
