package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_7236_저수지의물의총깊이구하기 {
//22.02.20
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			String[][] arr = new String[a + 2][a + 2];// 테두리를 만들기위해 +2
			for (int i = 0; i < a + 2; i++) {// 전체 G넣어줌
				for (int j = 0; j < a + 2; j++) {
					arr[i][j] = "G";
				}
			}

			int[] dr = { -1, 0, 1 };
			int[] dc = { -1, 0, 1 };
			for (int i = 1; i < a + 1; i++) {// 배열 입력받기
				for (int j = 1; j < a + 1; j++) {
					arr[i][j] = sc.next();
				}
			}
			int max_sum = 0;
			for (int i = 1; i < a + 1; i++) {// W찾기
				for (int j = 1; j < a + 1; j++) {
					int sum = -1;// 자기도 W라서 -1로 시작
					if (arr[i][j].equals("W")) {// 만약에 W이면
						for (int q = 0; q <= 2; q++) {
							for (int k = 0; k <= 2; k++) {// 8방탐색
								if (arr[i + dr[q]][j + dc[k]].equals("W")) {//주위에 W가있으면
									sum++; //sum++
									max_sum = (sum > max_sum) ? sum : max_sum;//max_sum보다 크면 최대값 최신화
								}
							}
						}
					}
				}
			}
			if(max_sum==0)//주위가 다 G면 1이라고 친다.
				max_sum=1;
			System.out.println("#"+tc+" "+max_sum);
		}
	}

}
