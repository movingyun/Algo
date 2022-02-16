package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1244_스위치켜고끄기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a + 1];
		for (int i = 1; i <= a; i++) {
			arr[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			int sex = sc.nextInt();
			int num = sc.nextInt();
			int num2 = num;
			if (sex == 1) {
				while (num <= a) {
					arr[num] = arr[num] * -1 + 1;
					num += num2;
				}
//			System.out.println(Arrays.toString(arr));
			} else if (sex == 2) {
				int loc_s = num;
				int loc_e = num;
				for (int j = 1;; j++) {
					if (num - j > 0 && num + j <= a) {
						if (arr[num - j] == arr[num + j]) {
							loc_s = num - j;
							loc_e = num + j;
						}
						else break;
					} else
						break;
				}
				for (int j = loc_s; j <= loc_e; j++) {
					arr[j] = arr[j] * -1 + 1;
				}
			}
//		System.out.println(Arrays.toString(arr));
		}
		for(int i=1; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			if(i%20==0)
				System.out.println();
		}
	}
}
