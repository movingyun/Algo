package BaekJoon;

import java.util.Scanner;

public class BaekJoon_22341_사각형의면적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = a;
		int c = a;
		for(int i=0; i<b; i++) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if(c1 >= r || c2 >= c)
				continue;
			if(r*c2 > c*c1) {
				c = c2;
			}
			else {
				r=c1;
			}
		}
		System.out.println(r*c);
	}
}
