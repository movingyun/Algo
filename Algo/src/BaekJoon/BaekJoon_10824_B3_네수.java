package BaekJoon;

import java.util.Scanner;
//22.03.02
//int로 하니까 계속 numberformat오류가 뜬다...
//long으로 바꾸고 Long.parseLong활용!!
public class BaekJoon_10824_B3_네수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();

		long ab = Long.parseLong(String.valueOf(a) + String.valueOf(b));
		long cd = Long.parseLong(String.valueOf(c) + String.valueOf(d));
		System.out.println(ab + cd);
	}
}
