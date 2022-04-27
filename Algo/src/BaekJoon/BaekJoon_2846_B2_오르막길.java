package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2846_B2_오르막길 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int st = 0;
		int ed = 0;
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (arr[i] > arr[i - 1]) {
				sum += arr[i] - arr[i - 1];
			} else {
				max = (max < sum) ? sum : max;
				sum = 0;
			}
			max = (max < sum) ? sum : max;
		}
		System.out.println(max);
	}
}
