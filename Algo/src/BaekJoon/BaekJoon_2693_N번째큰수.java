package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2693_N번째큰수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int n = sc.nextInt();
		
		
		for(int j = 0; j<n; j++) {
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[7]);
	}
}}
