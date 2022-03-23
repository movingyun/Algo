package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//22.03.19
//재귀로 O넣을 위치를 구하고 빈칸에 O를 넣어보면서 가려지나 확인
public class BaekJoon_18428_S1_감시피하기 {

	static int all = 0;
	static int pick = 3;
	static String[][] arr;
	static int visit[];
	static int result[];
	static int[] blank;
	static String[][] copyarr;
	static int[] dr = { -1, 1, 0, 0 };// 상하좌우
	static int[] dc = { 0, 0, -1, 1 };
	static int a;
	static String pr = "NO"; //최종출력

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(br.readLine());
		arr = new String[a][a];
		copyarr = new String[a][a];
		StringTokenizer st;

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < a; j++) {
				arr[i][j] = st.nextToken();
				if (arr[i][j].equals("X"))
					all++; // O를 둘수있는 수 세기
			}
		}
		visit = new int[all];
		result = new int[pick];
		blank = new int[all];
		// 전체 함수 만들기
		for (int i = 0; i < all; i++) {
			blank[i] = i + 1;
		}
		recur(0);
		System.out.println(pr);
	}// main함수

	public static void recur(int dept) {
		// 끝내
		if (dept >= pick) {
			// arr를 돌면서 X가 n번째 나왔을때 그게 result에있으면 O으로 바꾸고
			// 감시 안당하는지 판별
			int cnt = 0;
			int idx = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					copyarr[i][j] = arr[i][j];
				}
			}
			out: for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (copyarr[i][j].equals("X")) {
						cnt++; // 몇번째 X인지 찾고
						if (cnt == result[idx]) {// 그 자리가 O를 넣기로 한 자리면
							copyarr[i][j] = "O";
//							System.out.print(cnt + " \n");
							idx++;
						}
					}
					if (idx == 3)// 다 넣었으면
						break out;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
//					System.out.print(copyarr[i][j] + " ");
				}
//				System.out.println();
			}
			// O로 다 바꿨고 이제 감시 되는지 확인
			if (find()) {
				pr = "YES";
//				System.out.println("여기 가능!!!");
			}
			return;
		}

		// 재귀
		for (int i = 0; i < all; i++) {
			if (visit[i] == 1) {
				continue;
			}
			if (dept != 0 && result[dept - 1] > blank[i])
				continue;
			visit[i] = 1;
			result[dept] = blank[i];
			recur(dept + 1);
			visit[i] = 0;
		}
	}// recur함수

	static boolean find() {
		// find함수 다시 만들자
		boolean answer = true;
		out: for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (copyarr[i][j].equals("T")) {

					for (int q = 0; q < 4; q++) {
						int tr = i;
						int tc = j;
						while (true) {
							tr += dr[q];
							tc += dc[q];
							if (tr < 0 || tr >= a || tc < 0 || tc >= a || copyarr[tr][tc].equals("O")) {
								break;
							}
							if (copyarr[tr][tc].equals("S")) {
								answer = false;
								break out;
							}
						}
					}

				}
			}
		}
		return answer;
	}
}