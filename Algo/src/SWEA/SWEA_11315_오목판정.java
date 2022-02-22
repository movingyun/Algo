package SWEA;

import java.util.Scanner;
//22.02.22
//o가 있으면 행,열을 나눠서 5번연속 o가 있는지 찾는다
//열을 볼 때는 1자,왼쪽,오른쪽 아래로 내려가는것을 고려한다.
public class SWEA_11315_오목판정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			// 오목판의 크기 입력
			int a = sc.nextInt();
			// 오목판 만들기
			char[][] arr = new char[a][a];
			// 오목알 두기
			for (int i = 0; i < a; i++) {
				arr[i] = sc.next().toCharArray();
			}
			int flag = 0;
			String result = "NO";
			// 행 보기
			out1: for (int i = 0; i < a; i++) {
				for (int j = 0; j <= a - 5; j++) {
					if (arr[i][j] == 'o') {
						flag = 1;
						for (int q = 1; q < 5; q++) {
							if (!(arr[i][j + q] == 'o')) {
								flag = 0;
								break;
							}
						}
					}
					if (flag == 1) {
						result = "YES";
						break out1;
					}
				}
			}

			// 열 보기
			// 1자로 내려간다.
			out: for (int i = 0; i <= a - 5; i++) {
				for (int j = 0; j < a; j++) {
					if (arr[i][j] == 'o') {
						flag = 1;
						for (int q = 1; q < 5; q++) {
							if (!(arr[i + q][j] == 'o')) {
								flag = 0;
								break;
							}
						}
					}
					if (flag == 1) {
						result = "YES";
						break out;
					}
				}
			}
			// 왼쪽아래로
			out: for (int i = 0; i <= a - 5; i++) {
				for (int j = 4; j < a; j++) {
					if (arr[i][j] == 'o') {
						flag = 1;
						for (int q = 1; q < 5; q++) {
							if (!(arr[i + q][j - q] == 'o')) {
								flag = 0;
								break;
							}
						}
					}
					if (flag == 1) {
						result = "YES";
						break out;
					}
				}
			}
			// 오른쪽아래로
			out: for (int i = 0; i <= a - 5; i++) {
				for (int j = 0; j < a - 4; j++) {
					if (arr[i][j] == 'o') {
						flag = 1;
						for (int q = 1; q < 5; q++) {
							if (!(arr[i + q][j + q] == 'o')) {
								flag = 0;
								break;
							}
						}
					}
					if (flag == 1) {
						result = "YES";
						break out;
					}
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
