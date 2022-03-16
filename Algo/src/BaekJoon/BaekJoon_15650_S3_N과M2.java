package BaekJoon;

import java.util.Scanner;
//22.03.15
//nCr 조합 / 중복X
public class BaekJoon_15650_S3_N과M2 {
	static int a;
	static int cnt;
	static int[] num;
	static int sum;
	static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		cnt = sc.nextInt();
		num = new int[a];
		visit = new boolean[a];
		for(int i=0; i<a; i++) {
			num[i] = i+1;
		}
		recur(0,0);
	}
	
	public static void recur(int dept, int pick) {
		//이제 그만
		if(dept>=a) {			
			if(pick==cnt) {
				for(int i=0; i<a; i++) {
					if(visit[i])
						System.out.print(num[i]+" ");
				}
				System.out.println();
			}
			return;
		}
		
		//재귀
		visit[dept] = true;
		recur(dept+1, pick+1);
		visit[dept] = false;
		recur(dept+1, pick);
	}
}
