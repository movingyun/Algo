package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2525_B4_오븐시계 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int rh = a+c/60;
	int rm = b+c%60;

	if(rm>=60) {
		rh++;
		rm-=60;
	}
	if(rh>=24)
		rh-=24;
		
	System.out.printf("%d %d",rh,rm);
}
}
