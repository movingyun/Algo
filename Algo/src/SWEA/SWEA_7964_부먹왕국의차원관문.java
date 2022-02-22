package SWEA;

import java.util.Scanner;
// 22.02.26
// 1사이에 있는 0의 갯수를 커버되는 영역으로 나누어줘서 sum에 더한다.
public class SWEA_7964_부먹왕국의차원관문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[] arr = new int[a+2];
			arr[0] = 1;
			arr[a+1] = 1;
			for (int i = 1; i <= a; i++) {
				arr[i] = sc.nextInt();
			}

			int sum = 0;
			int cnt = 0;
			for (int i = 0; i < a+2; i++) {
				if (arr[i] == 0)
					cnt++;
				else {
					sum+=cnt/b;
					cnt=0;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
