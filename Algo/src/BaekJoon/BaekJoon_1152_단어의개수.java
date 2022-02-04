package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1152_단어의개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String[] b = a.split(" ");
		int sum = 0;
		for (String i : b) {
			if (i.equals(""))
				continue;
			else
				sum++;
		}
		System.out.println(sum);
	}
}
