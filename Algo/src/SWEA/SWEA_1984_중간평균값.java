package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1984_중간평균값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc =1; tc<=T; tc++) {
			int result;
			Double sum=(double) 0;
			int[] arr = new int[10];
			for(int i=0; i<10; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for(int j=1; j<=8; j++) {
				sum+=arr[j];
			}
			result = (int) Math.round(sum/8);
			
			
			System.out.println("#"+tc+ " "+result);
		}
	}
}
