package CodeUp;

import java.util.Scanner;

public class CodeUp_1512_숫자등고선 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		for(int i = X-n; i<X; i++) {
			for(int j = Y-n; j<Y; j++) {
				arr[X-i-1][Y-j-1] = Math.abs(i)+Math.abs(j)+1;
			}
		}		
			
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}

	}
}