package BaekJoon;

import java.util.Scanner;

//햄버거를 기준으로 왼쪽k부터 먹을 사람이 있는지 확인
//사람이 햄버거 먹었으면 visit처리
public class BaekJoon_19941_햄버거분배 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k = sc.nextInt();
		char[] arr = new char[a];
		int[] visit = new int[a];
		String s = sc.next();
		arr = s.toCharArray();
		int cnt = 0;
		for (int i = 0; i < a; i++) {
			// 햄버거면
			if (arr[i] == 'H') {
				// 먹을사람이 있는지 확인
				for (int j = -k; j <= k; j++) {
					if (i + j >= 0 && i + j < a && arr[i + j] == 'P' && visit[i + j] == 0) {
						cnt++;
						visit[i + j] = 1;
						break;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
