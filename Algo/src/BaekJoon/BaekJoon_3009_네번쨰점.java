package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_3009_네번쨰점 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {
			x.add(sc.nextInt());
			y.add(sc.nextInt());
		}
		int q = 0;
		int w = 0;
		for (int i = 0; i < 3; i++) {
			if (x.indexOf(x.get(i)) == x.lastIndexOf(x.get(i)))
				q = x.get(i);
			if (y.indexOf(y.get(i)) == y.lastIndexOf(y.get(i)))
				w = y.get(i);
		}
		System.out.println(q + " " + w);
	}
}
