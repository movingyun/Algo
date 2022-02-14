package SWEA;

import java.util.Scanner;

public class SWEA_1954_달팽이숫자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int a = sc.nextInt();
			int[][] arr = new int[a][a];
			System.out.println("#"+tc);
			int num=1;
			int i=0;
			int j=0;
			out : for(;;) {
				for(;;) {
					arr[i][j] = num;
					if(num==a*a)
						break out;
					if(j==a-1||arr[i][j+1]!=0)
						break;
					j++; num++;
				}
				for(;;) {
					i++; num++;
					arr[i][j] = num;
					if(num==a*a)
						break out;
					if(i==a-1||arr[i+1][j]!=0)
						break;
				}
				for(;;) {
					j--; num++;
					arr[i][j] = num;
					if(num==a*a)
						break out;
					if(j==0||arr[i][j-1]!=0)
						break;
				}
				for(;;) {
					i--; num++;
					arr[i][j] = num;
					if(num==a*a)
						break out;
					if(i==0||arr[i-1][j]!=0)
						break;
				}
			}
			for(int q=0; q<a; q++) {
				for(int k=0; k<a; k++) {
					System.out.print(arr[q][k]+" ");
				}
				System.out.println();
			}
		}
	}
}
