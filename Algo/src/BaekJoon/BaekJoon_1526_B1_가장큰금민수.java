package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1526_B1_가장큰금민수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int result = 0;
		for (int i = a; i > 0; i--) {
			int cnt = 0;
			for (int j = 0; j < (i + "").length(); j++) {
				if ((i + "").charAt(j) == '4' || (i + "").charAt(j) == '7') {
					cnt++;
				}

			}
			if (cnt == (i + "").length()) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
