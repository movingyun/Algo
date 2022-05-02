package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_4466_D3_최대성적표만들기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int sum = 0;
			int cnt = 0;
			for (int i = N - 1; i >= 0; i--) {
				sum += arr[i];
				cnt++;
				if (cnt == K) {
					break;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
