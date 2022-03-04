package BaekJoon;

import java.util.Scanner;

public class BaekJoon_11557_B1_양조장 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			String[] nat = new String[a];
			int[] res = new int[a];
			int max = 0;
			String max_na = "s";
			for (int i = 0; i < a; i++) {
				nat[i] = sc.next();
				res[i] = sc.nextInt();
				if (res[i] > max) {
					max = res[i];
					max_na = nat[i];
				}
			}

			System.out.println(max_na);
		}
	}
}
