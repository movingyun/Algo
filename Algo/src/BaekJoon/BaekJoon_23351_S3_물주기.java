package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

//22.03.17
//제일 오래 살라면? 순서대로 줘야되지않나.....
public class BaekJoon_23351_S3_물주기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[n];
		Arrays.fill(arr, k);
		int day = 0;
		out: for (int i = 0;; i += a) {
			// 0이 하나라도 있으면 끝
			for (int j = 0; j < n; j++) {
				if (arr[j] == 0) {
					break out;
				}
			}
			for (int j = i; j < i + a; j++) {
				arr[j] += b;
			}
			day++;
			for (int j = 0; j < n; j++) {
				arr[j]--;
			}

			if (i + a >= n)
				i -= n;
		}
		System.out.println(day);
	}
}
