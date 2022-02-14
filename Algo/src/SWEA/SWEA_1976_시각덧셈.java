package SWEA;

import java.util.Scanner;

public class SWEA_1976_시각덧셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			
			int h3 = h1+h2;
			int m3 = m1+m2;
			if(m3>60) {
				m3-=60;
				h3++;
			}
			if(h3>12) {
				h3-=12;
			}			
			System.out.println("#"+tc+" "+h3+" "+m3);
		}

	}
}
