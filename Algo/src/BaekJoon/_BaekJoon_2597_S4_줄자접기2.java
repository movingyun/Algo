package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class _BaekJoon_2597_S4_줄자접기2 {
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
		
		if (cut1 > len / 2) {
			point[1] = cut1;
		} else
			point[0] = cut1;
		
		if(arr2[0]<cut1&&arr2[1]<cut1) {
			arr2[0] = cut1 * 2 - arr2[0];
			arr2[1] = cut1 * 2 - arr2[1];
		}
		else if(arr3[0]<point[0]) {
			arr2[0] = cut1 * 2 - arr2[0];
		}
		else if(arr3[1]>point[1]) {
			arr2[1] = cut1 * 2 - arr2[1];
		}
		
		if(arr3[0]<cut1&&arr3[1]<cut1) {
			arr3[0] = cut1 * 2 - arr3[0];
			arr3[1] = cut1 * 2 - arr3[1];
		}
		else if(arr3[0]<point[0]) {
			arr3[0] = cut1 * 2 - arr3[0];
		}
		else if(arr3[1]>point[1]) {
			arr3[1] = cut1 * 2 - arr3[1];
		}
		

		if (arr2[0] - arr2[1] != 0) {
			double cut2 = (arr2[0] + arr2[1]) / 2;
			if (cut2 > (point[1] + point[0]) / 2) {
				point[1] = cut2;
			} else
				point[0] = cut2;

			Arrays.sort(arr3);
			if(arr3[0]<cut2&&arr3[1]<cut2) {
				arr3[0] = cut2 * 2 - arr3[0];
				arr3[1] = cut2 * 2 - arr3[1];
			}
			else if(arr3[0]<point[0]) {
				arr3[0] = cut2 * 2 - arr3[0];
			}
			else if(arr3[1]>point[1]) {
				arr3[1] = cut2 * 2 - arr3[1];
			}

		}
		
		if (arr3[0] - arr3[1] != 0) {
			double cut3 = (arr3[0] + arr3[1]) / 2;
		Arrays.sort(point);
			if (cut3 > (point[1] + point[0]) / 2) {
				point[1] = cut3;
			} else
				point[0] = cut3;
		}
		
		Arrays.sort(point);
		System.out.println(point[1] - point[0]);
	}
}
