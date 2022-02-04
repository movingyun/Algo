package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2908_상수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String st = br.readLine();
		String[] arr = st.split(" ");
		String a = arr[0];
		String b = arr[1];

		int sum_a = 0;
		int sum_b = 0;

		for (int i = 2; i >= 0; i--) {
			sum_a += (int) a.charAt(i) * Math.pow(1000, i);
			sum_b += (int) b.charAt(i) * Math.pow(1000, i);
		}
		int max = (sum_a > sum_b) ? sum_a : sum_b;
		for (int i = 2; i >= 0; i--) {
			int num = max / (int) Math.pow(1000, i);
			System.out.print((char) num);
			max = max % (int) Math.pow(1000, i);
		}

	}
}
