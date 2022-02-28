package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1259_B1_팰린드롬수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			String a = sc.next();
			if (a.equals("0"))
				break;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < a.length(); i++) {
				sb.append(a.charAt(i));
			}
			String flag = "yes";
			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) != sb.reverse().charAt(i))
					flag = "no";
			}
			System.out.println(flag);
		}
	}
}
