package SWEA;

import java.util.Scanner;

public class SWEA_2072_홀수만더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc =1; tc<=T; tc++) {
			int[] arr = new int[10];
			int sum =0;
			for(int i=0; i<10; i++) {
				arr[i] = sc.nextInt();
				if(arr[i]%2==1)
					sum+=arr[i];
			}
			System.out.printf("#%d %d\n",tc,sum);
			
			
		}
	}
}
