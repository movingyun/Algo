package BaekJoon;

import java.util.Scanner;
//22.03.03
public class BaekJoon_13333_B1_Q인덱스 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		int cnt = 0;
		int result = 0;
		for (int i = a; i > 0; i--) {
			cnt = 0;
			for (int j = 0; j < a; j++) {
				if (arr[j] >= i) {
					cnt++;
				}
			}
			if (i <= cnt) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
