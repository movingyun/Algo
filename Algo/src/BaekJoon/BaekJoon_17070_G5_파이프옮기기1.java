package BaekJoon;

import java.util.Scanner;

public class BaekJoon_17070_G5_파이프옮기기1 {
	static int cnt =0;
	static int a;
	static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		arr = new int[a+1][a+1];
		for(int i = 0; i<a; i++) {
			for(int j=0; j<a; j++) {
				arr[i][j] = sc.nextInt();
			}
		}// arr만들기 종료
		move(0,1,0);
		System.out.println(cnt);

	}//main함수 종료
	
	
	public static void move(int r,int c,int dir) {
		//그만
		if(arr[r][c]==0&&r==a-1&&c==a-1) {
			cnt++;
			return;
		}
				
		//재귀
		//오른쪽 : 0 / 대각 : 1 / 아래 : 2
		if(dir==0) {
			//오른쪽 보고있으면 조건봐서
			if(c+1<a&&arr[r][c+1]==0) move(r,c+1,0); //오른쪽으로 가기
			if(c+1<a&&r+1<a&&arr[r+1][c+1]==0&&arr[r+1][c]==0&&arr[r][c+1]==0)move(r+1,c+1,1); // 대각으로 가기
		}
		
		if(dir==1) {
			//대각일땐 다 갈수있음
			if(c+1<a&&arr[r][c+1]==0) move(r,c+1,0); // 오른쪽으로
			if(c+1<a&&r+1<a&&arr[r+1][c+1]==0&&arr[r+1][c]==0&&arr[r][c+1]==0) move(r+1,c+1,1); // 대각으로
			if(r+1<a&&arr[r+1][c]==0) move(r+1,c,2); // 아래로
		}
		
		if(dir==2) {
			//아래보고있으면
			if(c+1<a&&r+1<a&&arr[r+1][c+1]==0&&arr[r+1][c]==0&&arr[r][c+1]==0) move(r+1,c+1,1); // 대각으로
			if(r+1<a&&arr[r+1][c]==0) move(r+1,c,2); // 아래로
		}
		
	}//재귀식 끝
}