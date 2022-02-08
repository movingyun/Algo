package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2839_설탕배달 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		int[][] arr = new int[2000][1000];
		
		int num=0;
		for (int i = 0; 3 * i <= a; i++) {
			int b = a - 3 * i;
			num += i;
			if (b==0 || b % 5 == 0) {
				num += b / 5;
				System.out.println(num);
				break;
			}
			else
				num=0;
		}
		if(num==0)
			System.out.println(-1);
	}
}
