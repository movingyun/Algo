package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1316_그룹단어체커 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int sum = 0;

		for (int j = 0; j < t; j++) {
			String a = br.readLine();
			for (int i = 0; i < a.length() - 1; i++) {
				if (a.charAt(i) == a.charAt(i + 1))
					continue;
				else {
					if (a.lastIndexOf(a.charAt(i)) == i || a.lastIndexOf(a.charAt(i)) == (i + 1)) {
						continue;
					} else {
						sum += 1;
						break;
					}
				}

			}
		}
		System.out.println(t - sum);
	}
}
