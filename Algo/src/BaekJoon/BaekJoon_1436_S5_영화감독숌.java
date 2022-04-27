package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1436_S5_영화감독숌 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt = 0;
		int num = 666;
		while(true) {
			if((num+"").contains("666")) {
				cnt++;
				if(cnt==a)
					break;
			}
			num++;
		}
		System.out.println(num);
	}
}
