package BaekJoon;

import java.util.Scanner;

public class BaekJoon_7568_덩치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[][] arr = new int[a][2];

		for (int i = 0; i < a; i++) {// 몸무게, 키 입력
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int q = 0; q < a; q++) {
			int sum = 0;
			for (int k = 0; k < a; k++) {
				if (q == k)
					continue;
				if (arr[q][0] < arr[k][0] && arr[q][1] < arr[k][1])
					sum += 1;
			}
			System.out.println(sum + 1);
		}
	}
}
