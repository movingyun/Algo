package SWEA;

import java.util.Scanner;
//22.02.20 문제를 잘못읽었따..
public class _SWEA_1493_수의새로운연산 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int[][] arr = new int[10001][10001];
	int num =1;

	for(int i=1; i<10001; i++) {
		int x=i;
		int y=1;
		for(int j=1; j<=i; j++) {
			arr[x][y] = num;
			num++;
			x--;
			y++;
		}
	}
	
	
	for(int i=0; i<100; i++) {
		for(int j=0; j<100; j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
//	System.out.println();
//	for(int tc=1; tc<=T; tc++) {
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		System.out.println("#"+tc+" "+arr[b][a]);			
//	}

	
}
}
