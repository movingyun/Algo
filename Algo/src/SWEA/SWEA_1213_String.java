package SWEA;

import java.util.Scanner;

public class SWEA_1213_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();
			String a = sc.next();
			String b = sc.next();
			int sum = 0;
			for (int i = 0; i < b.length() - a.length() + 1; i++) {
				int flag = 1;
				for (int j = 0; j < a.length(); j++) {
					if (b.charAt(i + j) != a.charAt(j)) {
						flag = 0;
						break;
					}
				}
				if (flag == 1) {
					sum++;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
