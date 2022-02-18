package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10163_색종이1 {
	//사각형의 둘래는 1의 사방으로 0의 갯수이다!!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[1003][1003];
		int a = sc.nextInt();
		for (int tc = 1; tc <= a; tc++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			for (int i = x1; i < x1+x2; i++) {
				for (int j = y1; j < y1+y2; j++) {
						arr[i][j]=tc;
				}
			}
		}
//		for(int i=0; i<20; i++) {
//			for(int j=0; j<20; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		int[] sum = new int[a+1];
		for(int i=0; i<1003; i++) {
			for(int j=0; j<1003; j++) {
					sum[arr[i][j]]++;
			}
		}
		for(int i=1; i<a+1; i++) {
			System.out.println(sum[i]);
		}
		
	}
}
