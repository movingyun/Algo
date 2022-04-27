package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_1758_S4_알바생강호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List<Integer> map = new ArrayList<Integer>();
		for (int i = 0; i < a; i++) {
			map.add(sc.nextInt());
		}
		Collections.sort(map, Collections.reverseOrder());
		long sum = 0;
		for (int i = 0; i < a; i++) {
			int b = map.get(i) - i;
			if (b > 0)
				sum += b;
			else break;
		}
		System.out.println(sum);
	}
}
