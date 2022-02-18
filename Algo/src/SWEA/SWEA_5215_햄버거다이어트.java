package SWEA;

import java.util.Scanner;

public class SWEA_5215_햄버거다이어트 {
	static int N, max_cal;
	static int[] fav;
	static int[] cal;
	static int max_fav;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			max_fav = 0;
			N = sc.nextInt();
			max_cal = sc.nextInt();
			fav = new int[N];
			cal = new int[N];
			for (int i = 0; i < N; i++) {
				fav[i] = sc.nextInt();
				cal[i] = sc.nextInt();
			}
			recur(0,0,0);
//			System.out.println("#");
			System.out.println("#" + tc + " " + max_fav);
		}

	}
	
	static void recur(int n, int sum_fav, int sum_cal) {
		// 이제 그만 두는 파트
		if (n == N) {
			if (sum_cal <= max_cal) {
				if(sum_fav>max_fav)
					max_fav=sum_fav;
			}
			return;
		}
		
		recur(n + 1, sum_fav + fav[n], sum_cal + cal[n]);
		recur(n + 1, sum_fav, sum_cal);
	}
}
