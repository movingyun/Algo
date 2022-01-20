package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_4085_농사짓기좋은땅 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			arr[i][j] = sc.nextInt();
			}
		}

		int ans = 0;
		
		for (int i = 0; i <= n-y; i++) {
		for (int j = 0; j <= m-x; j++) {
			int sum = 0;
			for (int a = i; a < i+y; a++) {
			for (int b = j; b < j+x; b++) {
				sum += arr[a][b];
			}
			}
			ans = Math.max(ans, sum);
			
			}
		}
		System.out.println(ans);
	}
}
