package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			for (int a = 0; a <= i; a++) {
				System.out.print("*");
			}
		System.out.println("");
		}
	}
}
