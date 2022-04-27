package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//왜 3의조상이 3이 포함됨?
public class BaekJoon_2584_G4_가장가까운공통조상 {

	static int[][] table;
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int l = 0; l < tc; l++) {
			N = sc.nextInt(); // 노드의 수
			table = new int[3][N + 1];
			for (int i = 0; i < N - 1; i++) {
				int p = sc.nextInt();
				int s = sc.nextInt();
				if (table[0][p] == 0) {
					table[0][p] = s;
				} else {
					table[1][p] = s;
				}
				table[2][s] = p;
			}
			int f1 = sc.nextInt();
			List<Integer> f1L = findP(f1);
			System.out.println(findP(f1));
			int f2 = sc.nextInt();
			System.out.println(findP(f2));
			List<Integer> f2L = findP(f2);
			outer: for (int i = 0; i < f1L.size(); i++) {
				for (int j = 0; j < f2L.size(); j++) {
					if (f1L.get(i) == f2L.get(j)) {
						System.out.println(f1L.get(i));
						break outer;
					}
				}
			}

		} // tc끝
	}

	static public List<Integer> findP(int num) {
		List<Integer> pj = new ArrayList<Integer>();
		int curr = num;
		while (curr != 0) {
			curr = table[2][curr];
			pj.add(curr);
			continue;
		}
		return pj;
	}
}
