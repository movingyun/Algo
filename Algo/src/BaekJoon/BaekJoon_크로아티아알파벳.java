package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_크로아티아알파벳 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String a = br.readLine();

		for (String i : arr) {
			a=a.replaceAll(i, "1");
		}
		System.out.println(a.length());
	}
}
