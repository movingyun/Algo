package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_2112_보호필름 {

	static int D, W, K, film[][], min;
	static int A = 0, B = 1; // 약품 A상태 B상태
	static int[] drugA, drugB; // drugA: 막 1개에 약품 A의 상태를 표현하는 배열

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine().trim());

		StringTokenizer st = null;

		for (int tc = 1; tc <= TC; ++tc) {
			st = new StringTokenizer(br.readLine().trim());
			D = Integer.parseInt(st.nextToken());// 막 두께
			W = Integer.parseInt(st.nextToken());// 막 너비
			K = Integer.parseInt(st.nextToken());// 합격기준 연속 셀의 개수

			film = new int[D][W];
			drugA = new int[W];
			drugB = new int[W];

			min = Integer.MAX_VALUE;

			for (int i = 0; i < D; i++) {
				st = new StringTokenizer(br.readLine().trim());
				for (int j = 0; j < W; j++) {
					film[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			// 입력 처리 끝
			Arrays.fill(drugA, A);// int[] 의 기본 초기화가 0 이므로 생략 가능
			Arrays.fill(drugB, B);

			process(0, 0);
			System.out.println("#" + tc + " " + min);
		}
	}

	private static boolean check() {// 보호필름 성능검사
		// 열을 고정 행을 탐색
		// 연속된 셀의 같은 특성이 K개 이상인지 검사

		for (int c = 0; c < W; c++) { // 열 고정
			int count = 1;
			int before = film[0][c];

			for (int r = 1; r < D; r++) {
				int current = film[r][c];
				if (before == current) {
					if (++count == K)
						break;
				} else {
					before = current;
					count = 1;
				}
			}
			if (count < K)// 하나의 열을 고정해서 수직 검사
				return false;
		}
		return true;
	}

	private static boolean process(int row, int useCnt) {// 각 막에 부분집합으로 약품 비투여, 약품 A 투여 , 약품 B 투여

		if (row == D) {

			if (check()) {
				min = Math.min(min, useCnt);
				return min == 0; // 약품을 하나도 안썼으면 true, 사용했으면 false
			}

			return false; // 성능검사 통과 안했으면
		}

		if (useCnt >= min) {// 기존 임시 최적해의 최소 약품 수보다 현재까지 사용한 약품수가 같거나 크면 의미 없으므로 리턴
			return false;
		}
		int[] backup = film[row];// 현재 막의 상태 배열 기억

		// 약품 비투여
		if (process(row + 1, useCnt))
			return true;
		// 약품 A투여
		film[row] = drugA;
		process(row + 1, useCnt + 1);

//      if(process(row+1,useCnt+1))
//          return true;

		// 약품 B투여
		film[row] = drugB;
		process(row + 1, useCnt + 1);

//      if(process(row+1,useCnt+1))
//          return true;

		film[row] = backup; // 기존 막의 상태로 다시 바꾸기
		return false;
	}
}