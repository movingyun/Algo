package BaekJoon;

import java.util.Scanner;

public class BaekJoon_8958_OX퀴즈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();


		for (int i = 0; i < n; i++) {
			int sum = 0;
			int cnt = 1;
			String a = sc.next();
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == 'O') {
					sum += cnt;
					cnt++;
				} else
					cnt = 1;
			}
			System.out.println(sum);
			
		}
	}

}
