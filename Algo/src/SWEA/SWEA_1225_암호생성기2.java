package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SWEA_1225_암호생성기2 {
	public static void main(String[] args) throws IOException {
		// 연산 최소화
		// 40번 돌면 -15씩 되니 최소값을 15로 나누고 나머지 수들도 그 몫만큼 15로 나눠준 다음 시작.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken(); // tc버리기
			StringBuilder sb = new StringBuilder();
			List<Integer> arr = new ArrayList<Integer>();
			int min = 1000000;
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 8; i++) {
				int a = Integer.parseInt(st.nextToken());
				arr.add(a);
				min = (min > a) ? a : min;
			}
			int p = min / 15 -1; // 몫
			for (int i = 0; i < 8; i++) {
				arr.set(i, arr.get(i) - (15 * p));
			}

			// 1,2,3,4,5순서대로 빼주다가 0보다 작아지면 0으로 바꿔주고 break
			int num = 0;
			for (int i = 0;; i++) {
				if (arr.get(i % 8) - (i % 5 + 1) <= 0) {
					arr.set(i % 8, 0);
					num = i % 8;
					break;
				}
				arr.set(i % 8, arr.get(i % 8) - ((i % 5 + 1)));
			}
			sb.append("#"+tc);
			for (int i = num + 1; i != num + 9; i++) {
				sb.append(" " +arr.get(i % 8));
			}
			System.out.println(sb);
		}
	}
}
