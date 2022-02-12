package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1288_불면증치료 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			int num2 = num;
			int[] arr = new int[10];
			int result = 0;
			int sum = 0;
			while (sum != 10) {
				int a = num;
				while (a / 10 != 0) {// a/10이 0이 아닐때까지 돈다.
					if (arr[a % 10] == 0) {
						arr[a % 10]++;
						sum++;
					}
					a = a / 10;
				}
				if (arr[a % 10] == 0) {
					arr[a % 10]++;
					sum++;
				}
				result += 1;
				num = num2 * (result + 1);
			}
			System.out.println("#" + tc + " " + result*num2);
		}

	}
}
