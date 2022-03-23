package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_15655_N과M6 {
	static int all;
	static int pick;
	static int[] visit;
	static int[] result;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		all = sc.nextInt();
		pick = sc.nextInt();
		visit = new int[all];
		arr = new int[all];
		result = new int[pick];
		for (int i = 0; i < all; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		recur(0);

	}

	public static void recur(int dept) {
		// 끝내
		if (dept >= pick) {
			for (int i = 0; i < pick; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}

		// 재귀
		for (int i = 0; i < all; i++) {
			if (visit[i] == 1) {
				continue;
			}
			if(dept!=0&&result[dept-1]>arr[i]) continue;
			else {
				visit[i] = 1;
				result[dept] = arr[i];
				recur(dept + 1);
				visit[i] = 0;
			}
		}
	}
}
