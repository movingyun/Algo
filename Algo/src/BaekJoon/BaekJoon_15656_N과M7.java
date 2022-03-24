package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_15656_N과M7 {
	static int all;
	static int pick;
	static int[] result;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		all = sc.nextInt();
		pick = sc.nextInt();
		arr = new int[all];
		result = new int[pick];
		for (int i = 0; i < all; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		recur(0);
		System.out.println(sb);
	}

	public static void recur(int dept) {
		// 끝내
		if (dept >= pick) {
			for (int i = 0; i < pick; i++) {
				sb.append(result[i]+" ");
			}
			sb.append("\n");
			return;
		}

		// 재귀
		for (int i = 0; i < all; i++) {
				result[dept] = arr[i];
				recur(dept + 1);
		}
	}
}
