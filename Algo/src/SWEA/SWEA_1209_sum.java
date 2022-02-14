package SWEA;

import java.util.Scanner;

public class SWEA_1209_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();
			int max = 0;
			int[][] arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < 100; i++) {
				int sum = 0;
				for (int j = 0; j < 100; j++) {
					sum += arr[i][j];
				}
				if (sum > max)
					max = sum;
			}
			
			for (int j = 0; j < 100; j++) {
				int sum = 0;
				for (int i = 0; i < 100; i++) {
					sum += arr[i][j];
				}
				if (sum > max)
					max = sum;
			}
			
			int sum=0;			
			for(int i=0; i<100; i++) {
				sum+=arr[i][i];
			}
			if(sum>max)
				max=sum;
			
			sum=0;			
			for(int i=99; i>=0; i--) {
				sum+=arr[Math.abs(i-99)][i];
			}
			if(sum>max)
				max=sum;
			
			System.out.println("#" + tc + " " + max);
		}
	}
}
