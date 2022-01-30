package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon_1929_소수구하기 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		
		
		for (int i = s; i <= e; i++) {
			int cnt = 0;
			if (i == 1) {
				continue;}
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0)
					cnt += 1;
			}
			if (cnt == 0)
				System.out.println(i);
		}
	}
}
