package CodeUp;

import java.util.Scanner;

public class CodeUp_1507_4개의직사각형넓이 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int squ[][] = new int[101][101];
		int x_1, x_2, y_1, y_2;
		int sum = 0;

		for (int i = 0; i< 4; i++) {
			x_1 = s.nextInt();
			y_1 = s.nextInt();
			x_2 = s.nextInt();
			y_2 = s.nextInt();
			for (int j = x_1; j < x_2; j++) {
				for (int k = y_1; k < y_2; k++)
					squ[j][k] = 1;
			}
		}

		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (squ[i][j] == 1)
					sum++;
			}
		}
		System.out.println(sum);
	}
}
