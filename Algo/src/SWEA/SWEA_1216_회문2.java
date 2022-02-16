package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1216_회문2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();
			char[][] arr = new char[100][100]; //String을 char로 변경해서 넣을 배열 생성
			for (int i = 0; i < 100; i++) {
				String b = sc.next();
				arr[i] = b.toCharArray(); //char로 변경해서 미리 생성해둔 배열에 넣어둠
			}
			int max_g = 0; // 가로 최대값 변수 생성
			int max_s = 0; // 세로 최대값 변수 생성

			out: for (int num = 100; num > 0; num--) {//최대값을 구하는거기 때문에 길이가 100인 문자열에 회문이 있는지부터 확인
				for (int i = 0; i < 100; i++) {
					for (int j = 0; j < 100 - num + 1; j++) {
						int flag = 1; //flag에 1을 넣어두고 다른 글자가 있으면 0으로 변환 후 break!
						for (int q = 0; q < num / 2; q++) {
							if (arr[i][j + q] != arr[i][j + num - 1 - q]) {
								flag = 0;
								break;
							}
						}
						if (flag == 1) {//잘 통과한 글자가있다면 최대값에 넣어두고 break!
							max_g = num;
							break out;
						}
					}
				}
			}
			out: for (int num = 100; num > 0; num--) { //행 탐색이랑 동일하게 진행
				for (int j = 0; j < 100; j++) {
					for (int i = 0; i < 100 - num + 1; i++) {
						int flag = 1;
						for (int q = 0; q < num / 2; q++) {
							if (arr[i + q][j] != arr[i + num - 1 - q][j]) {
								flag = 0;
								break;
							}
						}
						if (flag == 1) {
							max_s = num;
							break out;
						}
					}
				}
			}
			System.out.printf("#%d %d", tc, Math.max(max_g, max_s));//행과 열 중 더 높은 값 출력
			System.out.println();
		}
	}
}
