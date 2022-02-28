package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10988_B1_팰린드롬인지확인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			sb.append(a.charAt(i));
		}
		int flag = 1;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) != sb.reverse().charAt(i)) {
				flag = 0;
				break;
			}
		}
		System.out.println(flag);
	}
}
