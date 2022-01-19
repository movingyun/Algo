package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1934_최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			
			while(min>0) {
				int tmp = max;
				max = min;
				min = tmp%min;
			}
			System.out.println(a*b/max);

		}
	}
}