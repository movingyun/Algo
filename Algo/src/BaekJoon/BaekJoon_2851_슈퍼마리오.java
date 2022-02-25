package BaekJoon;

import java.util.Scanner;

//22.02.24
//더해가면서 100이 넘기 직전에 sum, 100넘고나서 더한 sum_min을 비교해서
//100에 가까운거 출력, 차이가 똑같으면 sum_min출력
public class BaekJoon_2851_슈퍼마리오 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int sum_min = 0;
		int sum_max = 0;
		for (int i = 0; i < 10; i++) {
			if (sum + arr[i] > 100) {
				sum_max = sum;
				sum_max += arr[i];
				break;
			}
			sum += arr[i];
		}
		int result = (Math.abs(sum_max - 100) > Math.abs(sum - 100)) ? sum : sum_max;
		System.out.println(result);
	}
}
