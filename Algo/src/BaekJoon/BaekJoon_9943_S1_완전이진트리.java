package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//22.04.04
public class BaekJoon_9943_S1_완전이진트리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int[] tree = new int[(int) (Math.pow(2, h))];
		List<Integer> result2 = new ArrayList<Integer>();

		for (int i = 0; i < Math.pow(2, h) - 1; i++) {
			tree[i + 1] = sc.nextInt();
		}

		for (int i = 1; i <= h; i++) {
			for (int j = 0; j < tree.length; j++) {
				if (j % Math.pow(2, h - i) == 0 && j % Math.pow(2, h - i + 1) != 0) {
					System.out.print(tree[j] + " ");
				}
			}
			System.out.println();
		}

	}
}
