package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_11720 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum =0;
		for(int i =0; i<a; i++) {
			sum+=(int)num.charAt(i)-48;
		}
		System.out.println(sum);
	}
}
