package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_4153_직각삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
			Arrays.sort(arr);
			if (arr[0] + arr[1] + arr[2] == 0)
				break;
			if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2))
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}
