package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10829_B2_이진수변환 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        long a = Long.parseLong(input);
		StringBuilder sb = new StringBuilder();
		while(a/2>0) {
			sb.append(a%2);
			a/=2;
		}
		sb.append(a);
		System.out.println(sb.reverse());
	}
}
