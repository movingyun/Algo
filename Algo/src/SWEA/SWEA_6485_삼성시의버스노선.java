package SWEA;

import java.util.Scanner;
//22.02.23
//왜인지 모르겠는데 StringBuilder안쓰면 계속 오류남.....
public class SWEA_6485_삼성시의버스노선 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();
			int[] arr = new int[5001];
			int set = sc.nextInt();

			for (int i = 0; i < set; i++) {
				int s = sc.nextInt();
				int e = sc.nextInt();
				for (int j = s; j <= e; j++) {
					arr[j]++;
				}
			}
			int p = sc.nextInt();
			sb.append("#" + tc + " ");
			for (int i = 0; i < p; i++) {
				int c = sc.nextInt();
				sb.append(arr[c] + " ");
			}
			for (int i = 0; i < sb.length(); i++) {
				System.out.print(sb.charAt(i));
			}
			System.out.println();
		}
	}
}
