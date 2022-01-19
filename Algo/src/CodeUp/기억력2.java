package CodeUp;

import java.util.Scanner;

public class 기억력2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[10000001];

		for (int i = 0; i < n; i++) {
			arr[sc.nextInt()]++;
		}

		int num = sc.nextInt();
		int[] num_arr = new int[num];
		int cnt = 0;

		for (int i = 0; i < num; i++) {
			num_arr[i] = sc.nextInt();
			if (arr[num_arr[i]] > 0) {
				System.out.println(1);
			} else
				System.out.println(0);
		}

	}
}
