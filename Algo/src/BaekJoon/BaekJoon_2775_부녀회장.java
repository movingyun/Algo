package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2775_부녀회장 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		for (int t = 0; t < a; t++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[k + 1][n];
			for (int j = 0; j < n; j++) {
				arr[0][j] = j + 1;
			}
			for (int w = 0; w < k + 1; w++) {
				arr[w][0] = 1;
			}
			for (int x = 1; x < k + 1; x++) {
				for (int y = 1; y < n; y++) {
					arr[x][y] = arr[x][y - 1] + arr[x - 1][y];
				}
			}
			System.out.println(arr[k][n - 1]);
		}
	}
}
