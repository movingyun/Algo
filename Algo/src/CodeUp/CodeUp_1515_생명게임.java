package CodeUp;

import java.util.Scanner;

public class CodeUp_1515_생명게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[27][27];
		int[][] next_arr = new int[27][27];

		for (int i = 1; i <= 25; i++) {
			for (int j = 1; j <= 25; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 1; i <= 25; i++) {
			for (int j = 1; j <= 25; j++) {
				int sum = 0;

			for (int a = -1; a <= 1; a++) {
			for (int b = -1; b <= 1; b++) {
				if(a==0&&b==0)
					continue;
				if(arr[i+a][j+b]==1)
					sum++;
			}}

				if (arr[i][j] == 0 && sum == 3)
					next_arr[i][j] = 1;
				else if (arr[i][j] == 1 && (sum >= 4 || sum <= 1))
					next_arr[i][j] = 0;
				else if (arr[i][j] == 1 && (sum == 2 || sum == 3))
					next_arr[i][j] = 1;
			}
		}

		for (int i = 1; i <= 25; i++) {
			for (int j = 1; j <= 25; j++) {
				System.out.print(next_arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
