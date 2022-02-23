package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1592_영식이와친구들 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a + 1];
		int lim = sc.nextInt();
		int hp = sc.nextInt();
		int cnt = 0;
		int num = 1;
		int max = 0;
		for (;;) {
			arr[num]++;
			if (arr[num] == lim)
				break;
//			System.out.print(num+" ");
			cnt++;
			if (arr[num] % 2 == 1) {
				num = num + hp;
				while (num > a)
					num = num - a;
			}

			else if (arr[num] % 2 == 0) {
				num = num - hp;
				while (num <= 0)
					num = num + a;
			}
//			System.out.println(Arrays.toString(arr));
		}
		System.out.println(cnt);
	}
}
