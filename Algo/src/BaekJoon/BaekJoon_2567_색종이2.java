package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2567_색종이2 {
	//사각형의 둘래는 1의 사방으로 0의 갯수이다!!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[102][102];
		int a = sc.nextInt();
		int sum = 0;
		for (int tc = 0; tc < a; tc++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					if(arr[i][j]==0)
						arr[i][j]++;
				}
			}
		}
		for (int i = 1; i < 101; i++) {
			for (int j = 1; j < 101; j++) {
				if(arr[i][j]!=0) {
					int cnt = arr[i-1][j] + arr[i][j-1] + arr[i][j+1] + arr[i+1][j];
					sum+=4-cnt;
				}
			}
		}
		System.out.println(sum);
	}
}
