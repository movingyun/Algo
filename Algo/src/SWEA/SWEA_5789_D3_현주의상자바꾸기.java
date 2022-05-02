package SWEA;

import java.util.Scanner;

public class SWEA_5789_D3_현주의상자바꾸기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0; i<Q; i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				for(int j=a; j<=b; j++) {
					arr[j] = i+1;
				}
			}
			System.out.print("#"+tc+" ");
			for(int i=0; i<N; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}//tc
	}
}
