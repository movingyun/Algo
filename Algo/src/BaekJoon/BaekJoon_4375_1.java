package BaekJoon;

import java.util.Scanner;

public class BaekJoon_4375_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int n =sc.nextInt();
			int a = 0;
			int count =0;
			for(int i=1; i<=n; i++) {
				a = (a*10+1)%n;
				count++;
				if(a==0) {
					break;
				}
			}
			System.out.println(count);			
		}

	}
}
