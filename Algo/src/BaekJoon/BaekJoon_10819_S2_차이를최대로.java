package BaekJoon;

//22.03.17
//차이가 제일 크도록 더하면 되지않을까...? -> 제일큰거,제일작은거, 2번째큰거, 2번째 작은거 -> 계속 틀림
// 걍 재귀로 뽑아보자

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10819_S2_차이를최대로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		// 제일큰거 제일작은거 2번째로큰거 2번째로작은거 순서로 정렬
		int[] new_arr = new int[a];
		int idx = 0;
		for (int i = (a-1)/2; i >= 0; i--) {
			new_arr[idx++] = arr[i];
			if(idx==a)
				break;
			new_arr[idx++] = arr[i+(a/2)];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(new_arr));
		int sum = 0;
		for (int i = 1; i < a; i++) {
			sum += Math.abs(new_arr[i] - new_arr[i - 1]);
		}
		System.out.println(sum);

	}
}
