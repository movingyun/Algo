package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//이분탐색으로 풀어야된다...
//인터넷 보고 품
public class BaekJoon_2805_S3_나무자르기 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] tree = new int[N];

		int min = 0;
		int max = 0;

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());

			if (max < tree[i]) {
				max = tree[i];
			}
		}

		while (min < max) {
			int mid = (min + max) / 2;
			long sum = 0;
			for (int treeHeight : tree) {
				if (treeHeight - mid > 0) {
					sum += (treeHeight - mid);
				}
			}
			if (sum < M) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		System.out.println(min - 1);
	}
}