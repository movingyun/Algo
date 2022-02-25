package SWEA;

import java.util.Scanner;

//22.02.24 상호 죽이고싶다..
public class SWEA_1873_상호의배틀필드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			// 행,열 입력받는다.
			int h = sc.nextInt();
			int w = sc.nextInt();
			// char형 배열을 만들어주고 String을 받아서 넣어준다.
			char[][] arr = new char[h][w];
			for (int i = 0; i < h; i++) {
				arr[i] = sc.next().toCharArray();

			}
			int loc_r = 0;
			int loc_c = 0;
			// 처음 전차의 위치 찾기
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if ("<>^v".contains(Character.toString(arr[i][j]))) {
						loc_r = i;
						loc_c = j;
					}
				}
			}
			// 명령의 수 입력
			int a = sc.nextInt();
			String cal = sc.next();

			// 명령을 charAt함수를 활용하여 하나씩 수행
			for (int i = 0; i < a; i++) {
				switch (cal.charAt(i)) {
				// S일때
				case 'S':
					if (loc_c != 0 && arr[loc_r][loc_c] == '<') {
						for (int j = loc_c - 1; j >= 0; j--) {
							if (arr[loc_r][j] == '*') {
								arr[loc_r][j] = '.';
								break;
							}
							if (arr[loc_r][j] == '#') {
								break;
							}
						}
					}

					if (loc_c != w - 1 && arr[loc_r][loc_c] == '>') {
						for (int j = loc_c + 1; j < w; j++) {
							if (arr[loc_r][j] == '*') {
								arr[loc_r][j] = '.';
								break;
							}
							if (arr[loc_r][j] == '#') {
								break;
							}
						}
					}
					if (loc_r != 0 && arr[loc_r][loc_c] == '^') {
						for (int j = loc_r - 1; j >= 0; j--) {
							if (arr[j][loc_c] == '*') {
								arr[j][loc_c] = '.';
								break;
							}
							if (arr[j][loc_c] == '#') {
								break;
							}
						}
					}
					if (loc_r != h - 1 && arr[loc_r][loc_c] == 'v') {
						for (int j = loc_r + 1; j < h; j++) {
							if (arr[j][loc_c] == '*') {
								arr[j][loc_c] = '.';
								break;
							}
							if (arr[j][loc_c] == '#') {
								break;
							}
						}
					}
					break;
				case 'U':
					arr[loc_r][loc_c] = '^';
					if (loc_r != 0 && arr[loc_r - 1][loc_c] == '.') {
						arr[loc_r][loc_c] = '.';
						arr[loc_r - 1][loc_c] = '^';
						loc_r = loc_r - 1;
					}
					break;

				case 'R':
					arr[loc_r][loc_c] = '>';
					if (loc_c != w - 1 && arr[loc_r][loc_c + 1] == '.') {
						arr[loc_r][loc_c] = '.';
						arr[loc_r][loc_c + 1] = '>';
						loc_c = loc_c + 1;
					}
					break;
				case 'D':
					arr[loc_r][loc_c] = 'v';
					if (loc_r != h - 1 && arr[loc_r + 1][loc_c] == '.') {
						arr[loc_r][loc_c] = '.';
						arr[loc_r + 1][loc_c] = 'v';
						loc_r = loc_r + 1;
					}
					break;
				case 'L':
					arr[loc_r][loc_c] = '<';
					if (loc_c != 0 && arr[loc_r][loc_c - 1] == '.') {
						arr[loc_r][loc_c] = '.';
						arr[loc_r][loc_c - 1] = '<';
						loc_c = loc_c - 1;
					}
					break;
				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
	}
}
