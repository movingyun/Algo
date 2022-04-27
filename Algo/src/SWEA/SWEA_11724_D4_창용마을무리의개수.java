package SWEA;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//혼자 남겨져있는 노드가 있을 수 있음.....
//반례
//3 1
//1 2
public class SWEA_11724_D4_창용마을무리의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int[] visit_idx = new int[b];
			int[] visit_num = new int[a + 1];
			int[][] map = new int[b][2];

			for (int i = 0; i < b; i++) {
				map[i][0] = sc.nextInt();
				map[i][1] = sc.nextInt();
			}
			int result = 0;
			int cnt = 0;
			Queue<Integer> queue = new LinkedList<Integer>();

			while (cnt != b) {
				for (int i = 0; i < b; i++) {
					if (visit_idx[i] == 0) {
						queue.add(map[i][0]);
						visit_num[map[i][0]]++;
						queue.add(map[i][1]);
						visit_num[map[i][1]]++;
						visit_idx[i] = 1;
						cnt++;
						break;
					}
				}
				while (!queue.isEmpty()) {
					int curr = queue.poll();
					for (int i = 0; i < b; i++) {
						if (visit_idx[i] == 1) {
							continue;
						} else {
							if (map[i][0] == curr || map[i][1] == curr) {
								visit_idx[i] = 1;
								cnt++;
								if (visit_num[map[i][0]] == 0) {
									queue.add(map[i][0]);
									visit_num[map[i][0]]++;
								}
								if (visit_num[map[i][1]] == 0) {
									queue.add(map[i][1]);
									visit_num[map[i][1]]++;
								}
							}
						}
					}
				}
				result++;
			}
			for (int i = 1; i < visit_num.length; i++) {
				if (visit_num[i] == 0)
					result++;
			}
			System.out.println("#"+tc+" "+result);
		}
	}
}
