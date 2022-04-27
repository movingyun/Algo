package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1946_S1_신입사원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a =sc.nextInt();
			int v1 = 0; 
			int v2 = 0;
			int map[][] = new int[a][2];
			int visit[] = new int[a];
			for(int i=0; i<a; i++) {
				int q = sc.nextInt();
				int w = sc.nextInt();
				map[i][0] = q;
				map[i][1] = w;
				if(q==1) v1 = w;
				if(w==1) v2 = q;
			}
			int cnt = 0;
			for(int i=0; i<a; i++) {
				if(map[i][1]>v1||map[i][0]>v2) {
					cnt++;
				}
			}
			System.out.println(a-cnt);
		}
	}
}
