package BaekJoon;

import java.util.Scanner;

//22.03.18
//주사위 배열을 만들어두고 오른쪽으로갈때 얼만큼,아래,왼쪽으로 갈때 얼만큼씩
//이동하는지 규칙을 구하면서 for문 돌려준다. -> 규칙을 모르겠다....
//22.03.21
//규칙 찾음!! 1463 -> 5126 -> 3542 -> 6413 -> 2156 -> 3245 -> 1364 -> 5126

public class _BaeckJoon_2818_S3_숙제하기싫을때2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = { { 1, 4, 6, 3 }, { 5, 1, 2, 6 }, { 3, 5, 4, 2 }, { 6, 4, 1, 3 }, { 2, 1, 5, 6 }, { 3, 2, 4, 5 },
				{ 1, 3, 6, 4 } };
		int a = sc.nextInt();
		int b = sc.nextInt();
		int a_cnt = a / 7; // 행으로 몇바퀴 도나?
		int b_cnt = b / 4; // 열로 몇바퀴 도나?
		int sum = 0;

		// (a,b) -> ((7*a_cnt) + a%7 , (4*b_cnt) + b%4)

		// (7*a_cnt , (4*b_cnt)
		// (7,4) == 98
		sum += (98 * a_cnt * b_cnt);
		// ((7*a_cnt) , b%4)
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < b % 4; j++) {
				sum += (arr[i][j]) * a_cnt;
			}
		}
		// (a%7 , (4*b_cnt))
		for (int i = 0; i < a % 7; i++) {
			for (int j = 0; j < 4; j++) {
				sum += (arr[i][j]) * b_cnt;
			}
		}
		// (a%7 , b%4)
		for (int i = 0; i < a % 7; i++) {
			for (int j = 0; j < b % 4; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
