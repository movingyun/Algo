package BaekJoon;

import java.util.Scanner;

// 22.03.08
// 하나씩 뺼거를 정하면서 min을 구한다 -> 시간초과
// 다 더한담에 가장 크게 빠지는 구간을 정하면 어떨까? -> 해결!!
// 가장 크게 빠지는 구간 = 전,후로 거리 - 자기가 없을때 바로가는 거리가 가장 큰것!!
public class BaekJoon_10655_S3_마라톤1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] arr = new int[a][2];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int x = arr[0][0];
		int y = arr[0][1];

		int sum = 0;
		for (int j = 0; j < a; j++) {// 전체
			sum += Math.abs(arr[j][0] - x);
			sum += Math.abs(arr[j][1] - y);
			x = arr[j][0];
			y = arr[j][1];
		}
		// 전체는 20이다.
		// 어디를 빼야 가장 많이 빠지나?
		int max = 0;
		int result = 0;
		for (int i = 1; i < a - 1; i++) {
			int sum2 = 0;
			int minus = 0;
			sum2 += Math.abs(arr[i - 1][0] - arr[i][0]);
			sum2 += Math.abs(arr[i][0] - arr[i + 1][0]);
			sum2 += Math.abs(arr[i - 1][1] - arr[i][1]);
			sum2 += Math.abs(arr[i][1] - arr[i + 1][1]);
			minus += Math.abs(arr[i - 1][0] - arr[i + 1][0]);
			minus += Math.abs(arr[i - 1][1] - arr[i + 1][1]);
			result = sum2 - minus;
			if (max < result)
				max = result;
		}
		System.out.println(sum - max);
	}
}
