package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon_1929_소수구하기2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int[] arr = new int[1000001];
		arr[1] = 1;

		for (int j = 2; j < 1000000; j++) {
			for (int i = 2; j * i <= 1000000; i++) {
				if (arr[i * j] == 0) {
					arr[i * j]++;
				}
			}
		}

		for (int k = s; k <= e; k++) {
			if (arr[k] == 0)
				System.out.println(k);
		}

	}
}
