package BaekJoon;

import java.util.Scanner;

// 순열, 중복 허용
// Stringbuffer 안쓰니까 시간초과....
// 중복 허용이니까 visit 안써도 된다.
public class BaekJoon_15651_S3_N과M3 {

	static int[] result;
	static int pick;
	static int[] num;
	static int all;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		all = sc.nextInt();
		pick = sc.nextInt();
		num = new int[all];
		result = new int[all];
		for (int i = 0; i < all; i++) {
			num[i] = i + 1;
		}
		recur(0);
		System.out.println(sb);
	}

	public static void recur(int dept) {
		// 이제 그만해!
		if (dept >= pick) {
			for (int i = 0; i < pick; i++) {
				sb.append(result[i]+" ");
			}
			sb.append("\n");
			return;
		}

		// 재귀
		for (int i = 0; i < all; i++) {
			result[dept] = num[i];
			recur(dept + 1);
		}
	}
}
