package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1526_B1_가장큰금민수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int result = 0;
		for (int i = a; i > 0; i--) { //숫자받아서 하나씩 줄여나감
			int cnt = 0;
			for (int j = 0; j < (i + "").length(); j++) {
				//4나 7로 이루어져있니??
				if ((i + "").charAt(j) == '4' || (i + "").charAt(j) == '7') {
					cnt++;//맞으면 센다
				}

			}
			//센게 문자열만큼 세졌으면 정답!
			if (cnt == (i + "").length()) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
