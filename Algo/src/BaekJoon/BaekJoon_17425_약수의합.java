package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_17425_약수의합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int j = 0; j < t; j++) {

			long n = Integer.parseInt(br.readLine());
			long sum = 0;

			for (int i = 1; i <= n; i++) {
				sum += i * (n / i);
			}
			System.out.println(sum);
		}
	}
}