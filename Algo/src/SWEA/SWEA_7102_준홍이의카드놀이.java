package SWEA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SWEA_7102_준홍이의카드놀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		List<Integer> max = new ArrayList<Integer>();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max_num = 0;
			int[] cnt = new int[41];
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= b; j++) {
					cnt[i + j]++;
				}
			}
			for (int i = 0; i < 41; i++) {
				if (max.isEmpty()) {
					max.add(i);
					max_num = cnt[i];
				} else if (cnt[i] > max_num) {
					max_num = cnt[i];
					max.clear();
					max.add(i);
				} else if (cnt[i] == max_num) {
					max.add(i);
				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < max.size(); i++) {
				System.out.print(max.get(i) + " ");
			}
			System.out.println();
		}
	}
}
