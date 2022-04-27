package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//이분탐색으로 풀어야되는거 인터넷 보고 찾음...
public class BaekJoon_1920_S4_수찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		StringBuilder sb = new StringBuilder();
		Arrays.sort(arr);
		int b = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b; i++) {
			int num = Integer.parseInt(st.nextToken());
			int sta = 0;
			int mid = 0;
			int ed = a - 1;
			int flag = 0;
			while (sta <= ed) {
				mid = (sta + ed) / 2;
				if (arr[mid] == num) {
					flag = 1;
					break;
				}
				if (arr[mid] < num) {
					sta = mid + 1;
				} else {
					ed = mid-1;
				}
			}
			if (flag == 0)
				sb.append(0+"\n");
			else
				sb.append(1+"\n");
		}
		System.out.println(sb);

	}
}
