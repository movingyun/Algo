package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2810_컵홀더 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'S')
				sum++;
			else if (s.charAt(i) == 'L') {
				sum++;
				i++;
			}

		}
		sum++;
		if (sum > a)
			sum = a;
		System.out.println(sum);
	}
}
