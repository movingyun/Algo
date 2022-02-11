package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2231_분해합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		for (long i = 1; i<=a; i++) {
			long num = i;
			int sum = 0;
			while (true) {
				if (num / 10 == 0) {
					sum += num;
					break;
				} else {
					sum += num % 10;
					num /= 10;
				}
			}

			if(sum+i==a) {
				System.out.println(i);
				break;
			}
			if(i==a)
				System.out.println(0);
		}

	}
}
