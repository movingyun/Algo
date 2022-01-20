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

		int[][] arr = new int[m][n];
		
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("완료1");
		int ans = 0;
		
		for (int i = 0; i < n-y+1; i++) {
		for (int j = 0; j < m-x+1; j++) {
			int sum = 0;
			for (int a = 0; a < y; a++) {
			for (int b = 0; b < x; b++) {
				sum += arr[i + a][j + b];
			}
			}
			ans = Math.max(ans, sum);
			sum = 0;
			
			}
		}
		System.out.println(ans);
	}
}
