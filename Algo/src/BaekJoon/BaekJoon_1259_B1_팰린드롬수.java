package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1259_B1_팰린드롬수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			StringBuilder sb = new StringBuilder();
			int a = sc.nextInt();
			if (a == 0)
				break;
			String s = Integer.toString(a);
			for (int i = 0; i < s.length(); i++) {
				sb.append(s.charAt(i));
			}
			String flag = "yes";
			for (int i = 0; i < sb.length(); i++) {
				if (s.charAt(i) != sb.reverse().charAt(i))
					flag = "no";
			}
			System.out.println(flag);
		}
	}
}
