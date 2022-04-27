package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1912_S2_연속합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a + 1];
		arr[1] = sc.nextInt();
		int max = arr[1];
		for (int i = 2; i <= a; i++) {
			if(arr[i-1]<0) {
				arr[i] = sc.nextInt();	
			}
			else arr[i] = arr[i - 1] + sc.nextInt();
			if(max<arr[i]) max=arr[i];
		}
		System.out.println(max);
	}
}
