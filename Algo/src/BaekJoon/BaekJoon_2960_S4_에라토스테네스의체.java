package BaekJoon;

import java.util.Scanner;

// 22.03.02
// 에라토스테네스의 체를 만들고 cnt변수를 선언해서 하나씩 지울때 마다 cnt를 키워주고
// cnt가 N과 같아질 떄 break후 출력
public class BaekJoon_2960_S4_에라토스테네스의체 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int[] arr = new int[K + 1];
		int N = sc.nextInt();
		int cnt = 0;
		int result = 0;
		out: for (int i = 2; i <= K; i++) {
			if (arr[i] == 0) {
				for (int j = 1; i * j <= K; j++) {
					if (arr[i * j] == 0) {
						arr[i * j] = 1;
						cnt++;
						if (cnt == N) {
							result = i * j;
							break out;
						}
					}
				}
			}
		}
		System.out.println(result);
	}
}
