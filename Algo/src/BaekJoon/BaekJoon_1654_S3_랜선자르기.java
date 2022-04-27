package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

//55퍼에서 계속 틀린다... -> max를 max+1로해주니 해결!
public class BaekJoon_1654_S3_랜선자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long[] lan = new long[a];
		int b = sc.nextInt();
		for (int i = 0; i < a; i++) {
			lan[i] = sc.nextInt();
		}

		Arrays.sort(lan);
		// 이분탐색
		long st = 0;
		long mid = 0;
		long ed = lan[a - 1]+1;
		while (true) {
			mid = (st + ed) / 2;
			long sum = 0;
			for (int i = 0; i < a; i++) {
				sum += lan[i] / mid;
			}
			if (sum < b) {
				ed = mid;
			} else {
				st = mid+1;
			}
			if (st >= ed)
				break;
		}
		System.out.println(st-1);
	}
}
