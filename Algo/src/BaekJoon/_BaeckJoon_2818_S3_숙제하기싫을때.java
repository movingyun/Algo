package BaekJoon;

import java.util.Scanner;

//22.03.18
//주사위 배열을 만들어두고 오른쪽으로갈때 얼만큼,아래,왼쪽으로 갈때 얼만큼씩
//이동하는지 규칙을 구하면서 for문 돌려준다. -> 규칙을 모르겠다....
//22.03.21
//규칙 찾음!! 1463 -> 5126 -> 3542 -> 6214 -> 2651 하고나서  4235 -> 1562 -> 3245 -> 6512

public class _BaeckJoon_2818_S3_숙제하기싫을때 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr1 = { { 1, 4, 6, 3 }, { 5, 1, 2, 6 }, { 3, 5, 4, 2 }, { 6, 3, 1, 4 }, { 2, 6, 5, 1 } };
		int[][] arr2 = { { 4, 2, 3, 5 }, { 1, 5, 6, 2 }, { 3, 2, 4, 5 }, { 6, 5, 1, 2 } };
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int c = a - 5;

		// 처음 배열에서 돈 애들 더하기
		for (int i = 0; i < a; i++) {
			if(i>4)
				break;
			for (int j = 0; j < b; j++) {
				sum += arr1[i][j%4];
			}
		}
		int c_cnt = c / 4; // 행으로 몇바퀴 도나?
		int b_cnt = b / 4; // 열로 몇바퀴 도나?

		// (a,b) -> ((4*a_cnt) + a%4 , (4*b_cnt) + b%4)

		// (4*c_cnt , (4*b_cnt)
		// (4,4) == 56
		sum += (56 * c_cnt * b_cnt);

		// ((4*c_cnt) , b%4)
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < b % 4; j++) {
				sum += (arr2[i][j] * c_cnt);
			}
		}
		// (c%4 , (4*b_cnt))
		for (int i = 0; i < c % 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum += (arr2[i][j] * b_cnt);
			}
		}
		// (c%4 , b%4)
		for (int i = 0; i < c % 4; i++) {
			for (int j = 0; j < b % 4; j++) {
				sum += arr2[i][j];
			}
		}
		System.out.println(sum);

	}
}
