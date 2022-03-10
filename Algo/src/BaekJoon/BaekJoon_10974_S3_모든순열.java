package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10974_S3_모든순열 {
	static int a;
	static boolean[] visited;
	static int[] arr;
	static int[] result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		visited = new boolean[a];
		arr = new int[a];
		result = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = i + 1;
		}
		selectNum(0);
	}

	static void selectNum(int depth) {
		// 조건부
		// 다 만들었으면 출력해!
		if (depth == a) {
			for (int i = 0; i < a; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		// 재귀
		// 뽑은담에 다시 돌면서 안뽑은거있으면 뽑는다.
		for (int i = 0; i < a; i++) {
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			result[depth] = arr[i];
			selectNum(depth + 1);
			visited[i] = false;
		}
	}
}
