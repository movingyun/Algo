package BaekJoon;

import java.util.Scanner;

public class _BaekJoon_5568_S5_카드놓기 {
	static int a;
	static int cnt;
	static int[] num;
	static int sum;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		cnt = sc.nextInt();
		num = new int[a];
		for(int i=0; i<a; i++) {
			num[i] = sc.nextInt();
		}
		recur(0,0,0);
	}
	
	public static void recur(int dept, int pick, int sum) {
		//이제 그만
		if(dept>=a) {			
			if(pick==cnt) {
				System.out.println(sum);
			}
			return;
		}
		
		//재귀
		recur(dept+1, pick+1, sum+num[dept]);
		recur(dept+1, pick, sum);
		
	}
}
