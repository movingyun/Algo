package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_11723_S5_집합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		boolean[] visit = new boolean[21];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch (s) {
			case "add":
				int a = Integer.parseInt(st.nextToken());
				if (!visit[a]) {
					visit[a] = true;
				}
				break;
			case "remove":
				a = Integer.parseInt(st.nextToken());
				if (visit[a]) {
					visit[a] = false;
				}
				break;

			case "check":
				a = Integer.parseInt(st.nextToken());
				if (visit[a])
					sb.append(1 + "\n");
				else
					sb.append(0 + "\n");
				break;

			case "toggle":
				a = Integer.parseInt(st.nextToken());
				if (visit[a]) {
					visit[a] = false;
				} else {
					visit[a] = true;
				}
				break;

			case "all":
				Arrays.fill(visit, true);
				break;

			case "empty":
				Arrays.fill(visit, false);
				break;
			}
		}
		System.out.println(sb);
	}
}
