package BaekJoon;

import java.io.*;
import java.util.*;
//22.03.04
//문제는 쉬운데 input값을 어떻게 넣어야되는지 고민....
public class BaekJoon_10820_B2_문자열분석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while ((input = br.readLine()) != null) {
			char str[] = input.toCharArray();
			int small = 0, capital = 0, num = 0, blank = 0;
			for (char ch : str) {
				if ('a' <= ch && ch <= 'z')
					small++;
				else if ('A' <= ch && ch <= 'Z')
					capital++;
				else if ('0' <= ch && ch <= '9')
					num++;
				else
					blank++;
			}
			System.out.printf("%d %d %d %d\n", small, capital, num, blank);
		}
	}
}
