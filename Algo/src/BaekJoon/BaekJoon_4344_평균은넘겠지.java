package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon_4344_평균은넘겠지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int[] arr = new int[x];

			for (int k = 0; k < x; k++) {
				arr[k] = sc.nextInt();
			}

			double avg = Arrays.stream(arr).average().orElse(0);

			double cnt = 0;
			for (int k = 0; k < x; k++) {
				if (arr[k] > avg)
					cnt++;
			}
			double result = cnt*100/x;
			System.out.printf("%.3f%%\n",result);
			cnt=0;
		}
	}

}