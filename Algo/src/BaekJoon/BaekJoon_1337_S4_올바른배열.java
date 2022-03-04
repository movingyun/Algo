package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
//22.03.02
//연속해서 나오는 수를 cnt로 센 다음 5에서 빼줌 -> 빵꾸뚫려서 나오는걸 못잡는다.
public class BaekJoon_1337_S4_올바른배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int cnt = 1;
		int min = 4;
		int sel = 0;
		for (int i = 0; i < a - 1; i++) {
			// 빵꾸로 나올떄
			for (int j = 1; i + j < a && j < 5; j++) {
				if (arr[i + j] - arr[i] < 5) {
					sel = 4 - (j - 1) - 1;
					min = (sel < min) ? sel : min;
				}
			}
		}
		System.out.println(min);
	}
}
