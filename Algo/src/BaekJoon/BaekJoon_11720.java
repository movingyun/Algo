package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon_11720 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String num = sc.next();

		int sum = 0;
		for (int i = 0; i < a; i++) {
			sum += (int) num.charAt(i) - 48;
		}
		System.out.println(sum);
	}
}
