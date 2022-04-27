package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1149_S1_RGB거리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		// 빨 : 0, 초 : 1, 파 : 2
		int[] sum = new int[3];

		sum[0] = sc.nextInt();
		sum[1] = sc.nextInt();
		sum[2] = sc.nextInt();

		// 1. 다음행의 값과 자기의값을 더한 값이 가장 작은 현재 값을 택한다.
		// 2. 고른열과 다른 두 열 중 1번에 해당하는 값을 더한다.
		// 3. 마지막엔 그 전의거 빼고 둘 중 작은값 택한다.
		for (int i = 0; i < a - 1; i++) {
			int r = sc.nextInt();
			int g = sc.nextInt();
			int b = sc.nextInt();

			int p = r + Math.min(sum[1], sum[2]);
			int o = g + Math.min(sum[0], sum[2]);
			int u = b + Math.min(sum[0], sum[1]);

			sum[0] = p;
			sum[1] = o;
			sum[2] = u;
		}
		int result = Math.min(Math.min(sum[0], sum[1]), sum[2]);
		System.out.println(result);
	}
}
