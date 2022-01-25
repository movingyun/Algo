package BaekJoon;

import java.util.Scanner;

public class BaekJoon_11653_소인수분해 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num = 2;

		for (int i =2; i<10000000; i++) {

			if (n == num) {
				System.out.println(num);
				break;
			}

			if (n % num == 0) {
				n = n / num;
				System.out.println(num);
			}

			else
				num++;

		}
	}
}
