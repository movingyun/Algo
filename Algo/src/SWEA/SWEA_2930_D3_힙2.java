package SWEA;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SWEA_2930_D3_힙2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int[] arr = new int[a + 3];
			int cnt = 1;
			int idx_new = 1;
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			for (int i = 0; i < a; i++) {
				int b = sc.nextInt();
				idx_new = cnt;
				// 추가
				if (b == 1) {
					arr[cnt] = sc.nextInt();
					while (idx_new > 1) {
						if (arr[idx_new] > arr[idx_new / 2]) {
							int ch = arr[idx_new];
							arr[idx_new] = arr[idx_new / 2];
							arr[idx_new / 2] = ch;
							idx_new /= 2;
							continue;
						}
						break;
					}
					cnt++;
					continue;
				}
				// 삭제
				else {
					// 비어있으면 -1
					if (arr[1] == 0) {
						sb.append(-1 + " ");
						continue;
					}
					int idx_new2 = 1;
					arr[idx_new2] = arr[cnt];
					arr[cnt] = 0;
					cnt--;
					int max = (arr[idx_new2 * 2] > arr[idx_new2 * 2 + 1]) ? idx_new2 * 2 : idx_new2 * 2 + 1;
					if (arr[1] > arr[max])
						break;
					while (idx_new2 <= cnt) {
						if (arr[idx_new2] < arr[max]) {
							int ch = arr[max];
							arr[max] = arr[idx_new2];
							arr[idx_new2] = ch;
							idx_new2 = max;
							continue;
						}
						break;
					}
					sb.append(arr[idx_new2] + " ");
				}
			}
			System.out.println(sb);
		}
	}
}
