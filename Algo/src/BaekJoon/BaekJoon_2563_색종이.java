package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

//22.02.24
public class BaekJoon_2563_색종이 {
	//100*100 이중배열에 색종이가 포함된곳을 1로 한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[101][101];
		int a = sc.nextInt();
		for (int tc = 1; tc <= a; tc++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			for (int i = x1; i < x1+10; i++) {
				for (int j = y1; j < y1+10; j++) {
						arr[i][j]++;
				}
			}
		}

		int sum = 0;
		for(int i=1; i<101; i++) {
			for(int j=1; j<101; j++) {
					if(arr[i][j]!=0)
						sum++;
			}
		}
			System.out.println(sum);
	}
}
