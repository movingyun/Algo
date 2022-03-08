package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class _BaekJoon_1759_G5_암호만들기 {
	static int a,b;
	static boolean[] visited;
	static String[] arr;
	static String[] result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		a = sc.nextInt();
		visited = new boolean[a];
		arr = new String[a];
		result = new String[b];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.next();
		}
		selectNum(0);
	}

	static void selectNum(int depth) {

		// 조건부
		// 다 만들었으면 출력해!
		if (depth == b) {
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
