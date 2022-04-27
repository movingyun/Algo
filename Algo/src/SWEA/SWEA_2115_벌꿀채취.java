package SWEA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_2115_벌꿀채취 {
	static int size;
	static int cnt;
	static int bucket;
	static int[][] map;
	static int max, pick, maxi;
	static int r, c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			size = sc.nextInt(); // map의 크기
			cnt = sc.nextInt(); // 몇개 벌통?
			bucket = sc.nextInt(); // 얼마나 담을수있나?
			map = new int[size][size];
			max = 0;
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size - (cnt - 1); j++) {
					// dfs돌려서 그 중 큰거 찾아
					maxi = 0;
					for (int k = 1; k <= cnt; k++) {
						pick = k;
						r = i;
						c = j;
						select(0, 0, 0, 0);
					}
					list.add(maxi);
				}
			}
			int resultMax = 0;
			int resultSum = 0;
			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = 1; j < list.size() - i; j++) {
					if ((i / (size - cnt + 1) == (i + j) / (size - cnt + 1)) && j <= cnt - 1)
						continue;
					resultSum = list.get(i) + list.get(i + j);
					if (resultSum > resultMax) {
						resultMax = resultSum;
					}
				}
			}
			System.out.printf("#%d %d\n", tc, resultMax);
		} // tc 끝
	}// main 끝

	public static void select(int dept, int start, int sum, int result) {
		if (sum > bucket)
			return;
		// 끝내
		if (dept == pick) {
			if (result > maxi)
				maxi = result;
			return;
		}
		// 계속해
		for (int i = start; i < cnt; i++) {
			select(dept + 1, i + 1, sum + map[r][c + i], result + (map[r][c + i] * map[r][c + i]));
		}
	}
}
