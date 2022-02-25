package BaekJoon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_11399_S3_ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 1; i < a; i++) {
			arr[i] += arr[i - 1];
		}
		int sum = 0;
		for (int i = 0; i < a; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
