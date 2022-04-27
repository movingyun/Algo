package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2096_G4_내려가기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] sum = new int[3][2];
		
		//sum[][0] = 최소 / sum[][1] = 최대
		
		Arrays.fill(sum[0], sc.nextInt());
		Arrays.fill(sum[1], sc.nextInt());
		Arrays.fill(sum[2], sc.nextInt());
		
		for(int i=1; i<cnt; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			
			int a = num1 + Math.min(sum[0][0], sum[1][0]);
			int b = num1 + Math.max(sum[0][1], sum[1][1]);
			int c = num2 + Math.min(sum[2][0], Math.min(sum[0][0], sum[1][0]));
			int d = num2 + Math.max(sum[2][1], Math.max(sum[0][1], sum[1][1]));
			int e = num3 + Math.min(sum[1][0], sum[2][0]);
			int f = num3 + Math.max(sum[1][1], sum[2][1]);
			
			sum[0][0] = a;
			sum[0][1] = b;
			sum[1][0] = c;
			sum[1][1] = d;
			sum[2][0] = e;
			sum[2][1] = f;
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				if(sum[i][j]<min)
					min = sum[i][j];
				if(sum[i][j]>max)
					max = sum[i][j];
			}
		}
		System.out.printf("%d %d",max,min);
	}
}
