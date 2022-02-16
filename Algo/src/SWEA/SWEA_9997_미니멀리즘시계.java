package SWEA;

import java.util.Scanner;

public class SWEA_9997_미니멀리즘시계 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int tc=1; tc<=T; tc++) {
		int ang = sc.nextInt();
		int h = ang/30;
		int m = (ang%30)*2;
		
		
		System.out.printf("#%d %d %d\n",tc, h, m);
	}
	
}
}
