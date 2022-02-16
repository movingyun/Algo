package SWEA;

import java.util.Scanner;

public class SWEA_5432_쇠막대기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String a = sc.next();
			int cnt = 0; // 현재 막대기 수
			int sum = 0; // 잘린 막대기 수

			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == '(' && a.charAt(i + 1) != ')') //막대기 시작 찾기
					cnt++; // 막대기 수 +1
				else if (a.charAt(i) == '(' && a.charAt(i + 1) == ')') {//레이저 찾기
					sum += cnt; // 지금까지 막대기 잘린다.
					i++; // ')'을 건너뛰려고
				} else if (a.charAt(i) == ')') { //닫힌 막대기 찾기
					sum += 1; // 막대기가 끝나면서 조각하나 나옴
					cnt -= 1; // 현재 막대기 -1
				}
			}
			System.out.println("#" + tc + " " + sum);
		}

	}
}