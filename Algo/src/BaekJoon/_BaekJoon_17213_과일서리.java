package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class _BaekJoon_17213_과일서리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m+1];
		int[] num = new int[n+1];
		int[] num_new = new int[n+1];
		
		arr[n] = 1;
		arr[n+1] = n;
		for(int i=1; i<=n; i++) {
			num[i] = 1;			
		}
		
		for(int i=n+3; i<=m; i++) {
			for(int q=1; q<=n; q++) {
				//그 전의 거에서 자기 전까지 더한다.
				
			}
			
		}
		
		System.out.println(Arrays.toString(num_new));
		
		
	
	}
}
