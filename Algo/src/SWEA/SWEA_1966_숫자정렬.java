package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1966_숫자정렬 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int tc=1; tc<=T; tc++) {
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		
		System.out.print("#"+tc+" ");
		for(int i=0; i<a; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
}
