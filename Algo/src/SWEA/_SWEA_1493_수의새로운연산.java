package SWEA;

import java.util.Scanner;

//22.02.20 문제를 잘못읽었따..
public class _SWEA_1493_수의새로운연산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ax = 0;
			int ay = 0;
			int bx = 0;
			int by = 0;

			int[][] arr = new int[301][301];
			int num = 1;

			for (int i = 1; i < 301; i++) {
				int x = i;
				int y = 1;
				for (int j = 1; j <= i; j++) {
					arr[x][y] = num;
					if(num==a) {
						ax=x;
						ay=y;
					}
					if(num==b) {
						bx=x;
						by=y;
					}
					num++;
					x--;
					y++;
				}
			}

			num = 90000;
			for (int i = 300; i > 1; i--) {
				int x = i;
				int y = 300;
				for (int j = 300; j >= i; j--) {
					arr[x][y] = num;
					if(num==a) {
						ax=x;
						ay=y;
					}
					if(num==b) {
						bx=x;
						by=y;
					}
					num--;
					x++;
					y--;
				}
			}
			int new_x=ax+bx;
			int new_y=ay+by;
			System.out.println("#" + tc + " " + arr[new_x][new_y]);
		}
	}
}
