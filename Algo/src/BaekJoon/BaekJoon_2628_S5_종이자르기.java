package BaekJoon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//22.03.02

public class BaekJoon_2628_S5_종이자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		List<Integer> col = new ArrayList<Integer>();
		List<Integer> row = new ArrayList<Integer>();
		col.add(0);
		col.add(c);
		row.add(0);
		row.add(r);
		for (int i = 0; i < t; i++) {
			int w = sc.nextInt();
			if (w == 0)
				row.add(sc.nextInt());
			else
				col.add(sc.nextInt());
		}
		Collections.sort(row);
		Collections.sort(col);
		int max = 0;
		for (int i = 1; i < row.size(); i++) {
			for (int j = 1; j < col.size(); j++) {
				max = ((col.get(j) - col.get(j - 1)) * (row.get(i) - row.get(i - 1)) > max)
						? (col.get(j) - col.get(j - 1)) * (row.get(i) - row.get(i - 1))
						: max;
			}
		}
		System.out.println(max);
	}
}
