package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1일차_view {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int result = 0;
			int time = sc.nextInt();
			int[] arr = new int[time];
			for (int j = 0; j < time; j++) {
				arr[j] = sc.nextInt();
			}
			for (int i = 2; i < arr.length - 2; i++) {
				int[] arr_new = { arr[i - 2], arr[i - 1], arr[i + 1], arr[i + 2] };
				if (arr[i] < arr[i - 1] || arr[i] < arr[i - 2] || arr[i] < arr[i + 1] || arr[i] < arr[i + 2])
					continue;
				else {
					Arrays.sort(arr_new);
					result += arr[i] - arr_new[3];
				}
			}
			System.out.println("#"+tc+" " + result);
		}
	}
}
