package SWEA;

import java.util.Scanner;

public class SWEA_2007_패턴마디의길이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String a = sc.next();
			int result = 0;
			out : for (int i = 0; i <= 9; i++) {
				for (int j = 1; j < i + 1; j++) {
					if (a.charAt(i) == a.charAt(j + i))
						if (a.charAt(i+2) == a.charAt(j + i+2)) {
							result = j;
							break out;
						}
							
					
				}
			}
			System.out.println("#" + tc + " " + result);
		}

	}
}
