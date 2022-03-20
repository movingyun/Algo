package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//22.03.19
//빈칸에 O를 다 넣어보면서 가려지나 확인
public class _BaekJoon_18428_S1_감시피하기 {

	static int all = 0;
	static int pick = 3;
	static String[][] arr;
	static int visit[];
	static int result[];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		arr = new String[a][a];
		StringTokenizer st;
		visit = new int[all];
		result = new int[pick];

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < a; j++) {
				arr[i][j] = st.nextToken();
				if (arr[i][j].equals("X"))
					all++;
			}
		}
	}// main함수

	public static void recur(int dept) {
		// 끝내
		if (dept >= all) {

		}

		// 재귀
		for (int i = 0; i < all; i++) {
			if (visit[i] == 1) {
				continue;
			}
		}
	}// recur함수
}
