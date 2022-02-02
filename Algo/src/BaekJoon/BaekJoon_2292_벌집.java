package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2292_벌집 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int result = a;
		int b = 1;
		int i = 0;
		for (;;) {
			b = b + ((i) * 6);
			i++;
			if (a <= b)
				break;
		}
			System.out.println(i);

	}
}
