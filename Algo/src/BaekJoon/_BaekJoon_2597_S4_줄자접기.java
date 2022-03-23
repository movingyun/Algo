package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class _BaekJoon_2597_S4_줄자접기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		Double[] arr1 = { sc.nextDouble(), sc.nextDouble() };
		Double[] arr2 = { sc.nextDouble(), sc.nextDouble() };
		Double[] arr3 = { sc.nextDouble(), sc.nextDouble() };
		Double[] point = { 0.0, (double) len }; // 시작점

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);

		double cut1 = (arr1[0] + arr1[1]) / 2;
//		System.out.printf("cut1 : %f\n",cut1);
		if (cut1 > len / 2) {
			point[1] = cut1;
		} else
			point[0] = cut1;
//		System.out.println("point"+Arrays.toString(point));

		arr2[0] = cut1 * 2 - arr2[0];
		arr3[0] = cut1 * 2 - arr3[0];

		Arrays.sort(arr2);
//		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr3);
//		System.out.println(Arrays.toString(arr3));

		if (arr2[0] - arr2[1] != 0) {
//			System.out.println(arr2[0]);
//			System.out.println(arr2[1]);
//			System.out.println("달라");
			double cut2 = (arr2[0] + arr2[1]) / 2;
//			System.out.printf("cut2 : %f\n", cut2);
			if (cut2 > (point[1] - point[0]) / 2) {
				point[1] = cut2;
			} else
				point[0] = cut2;
//			System.out.println("point"+Arrays.toString(point));

			arr3[0] = cut2 * 2 - arr3[0];
			Arrays.sort(arr3);
		}

		if (arr3[0] - arr3[1] != 0) {
			double cut3 = (arr3[0] + arr3[1]) / 2;
//		System.out.printf("cut3 : %f\n",cut3);
//		System.out.println("point"+Arrays.toString(point));
			if (cut3 > (point[1] - point[0]) / 2) {
				point[1] = cut3;
			} else
				point[0] = cut3;
//		System.out.println("point"+Arrays.toString(point));
		}

		System.out.println(point[1] - point[0]);
	}
}
