package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_5622_다이얼 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			int num = 0;
			num = ((int) a.charAt(i) - 65) / 3 + 3;
			if (a.charAt(i) == 'S' || a.charAt(i) == 'V' || a.charAt(i) == 'Y' || a.charAt(i) == 'Z')
				num--;
			sum += num;
		}
		System.out.println(sum);
	}
}
