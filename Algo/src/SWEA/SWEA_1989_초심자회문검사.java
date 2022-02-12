package SWEA;

import java.util.Scanner;

public class SWEA_1989_초심자회문검사 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int result = 0;
			String a1 = sc.next();
			String a2 = "";
			for (int i = a1.length() - 1; i >= 0; i--) {
				a2 = a2.concat(Character.toString(a1.charAt(i)));
			}
			if (a1.equals(a2))
				result += 1;
			System.out.println("#" + tc + " " + result);
		}

	}
}
