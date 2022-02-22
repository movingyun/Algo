package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_7087_문서제목붙이기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int[] arr = new int[a + 1];
			for (int i = 1; i < a + 1; i++) {
				arr[i] = sc.next().charAt(0) - 64;
			}
			Arrays.sort(arr);
//			System.out.println(Arrays.toString(arr));
			int sum = 0;
			for (int i = 1; i < a + 1; i++) {
				if (arr[i] == arr[i - 1] || arr[i] == arr[i - 1] + 1)
					sum=arr[i];
				else {
					break;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
