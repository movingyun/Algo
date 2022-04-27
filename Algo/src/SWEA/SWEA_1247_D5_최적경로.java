package SWEA;

import java.util.Scanner;

public class SWEA_1247_D5_최적경로 {

	static int cusNum;
	static int[][] cus;
	static int[][] result;
	static int min;
	static int[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			cusNum = sc.nextInt();
			min = 987654;
			cus = new int[cusNum][2];
			visit = new int[cusNum];
			result = new int[cusNum + 2][2];
			result[0][0] = sc.nextInt(); // 회사 x
			result[0][1] = sc.nextInt(); // 회사 y
			result[cusNum + 1][0] = sc.nextInt(); // 집 x
			result[cusNum + 1][1] = sc.nextInt(); // 집 y

			for (int i = 0; i < cusNum; i++) {
				for (int j = 0; j < 2; j++) {
					cus[i][j] = sc.nextInt();
				}
			}

//			per(0);
			per2(0,0);
			System.out.printf("#%d %d\n", tc, min);
		} // tc함수
	}// main함수

	//다 돌리고 계산
	public static void per(int dept) {
		// 끝내
		if (dept == cusNum) {
			int sum = 0;
			for (int i = 0; i < cusNum+1; i++) {
				int dist = (Math.abs(result[i][0] - result[i + 1][0])
						+ Math.abs(result[i][1] - result[i + 1][1]));
				sum += dist;
			}
			if (sum < min)
				min = sum;
			return;
		}

		// 재귀
		for (int i = 0; i < cusNum; i++) {
			if (visit[i] == 1)
				continue;
			else {
				visit[i] = 1;
				result[dept + 1][0] = cus[i][0];
				result[dept + 1][1] = cus[i][1];
				per(dept + 1);
				visit[i] = 0;
			}
		}
	}
	
	//계산하면서 돌리기
	public static void per2(int dept, int sum) {
		// 끝내
		if(sum > min) return; 
		
		if (dept == cusNum) {
			sum += Math.abs(result[cusNum][0] - result[cusNum + 1][0]);
			sum += Math.abs(result[cusNum][1] - result[cusNum + 1][1]);
			if (sum < min)
				min = sum;
			return;
		}

		// 재귀
		for (int i = 0; i < cusNum; i++) {
			if (visit[i] == 1)
				continue;
			else {
				visit[i] = 1;
				result[dept + 1][0] = cus[i][0];
				result[dept + 1][1] = cus[i][1];
				int dist = (Math.abs(result[dept][0] - result[dept + 1][0])
						+ Math.abs(result[dept][1] - result[dept + 1][1]));
				per2(dept + 1,sum+dist);
				visit[i] = 0;
			}
		}
	}
}
