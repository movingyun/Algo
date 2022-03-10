package BaekJoon;

import java.util.Scanner;

//22.03.10
//100만까지 있어서 int로 하면 백만x백만으로 범위 초과한다.
public class BaekJoon_13458_B2_시험감독 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 시험장 수
		long[] arr1 = new long[a];
		for (int i = 0; i < a; i++) {
			arr1[i] = sc.nextInt(); // 시험장 당 인원
		}
		long sum = a;
		long c = sc.nextInt(); // 총 감독
		long d = sc.nextInt(); // 부 감독

		for (int i = 0; i < a; i++) {
			if (arr1[i] - c >= 0)
				sum += ((arr1[i] - c) + (d - 1)) / d;
		}
		System.out.println(sum);
	}
}
