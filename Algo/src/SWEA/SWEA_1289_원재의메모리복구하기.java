package SWEA;

import java.util.Scanner;

public class SWEA_1289_원재의메모리복구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String a = sc.next();
			int cnt = 0;
			char c = '0';
			for (int i = 0; i < a.length(); i++) {
				if (c != a.charAt(i)) {
					c = a.charAt(i);
					cnt++;
				}
			}
//			if(a.charAt(0)=='0')
//				cnt++;
			System.out.printf("#%d %d\n", tc, cnt);
		}

	}
}
