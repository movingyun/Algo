package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon_9020_골드바흐의추측 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10001];

		for (int j = 2; j < 10000; j++) {
			for (int i = 2; j * i <= 10000; i++) {
				if (arr[i * j] == 0) {
					arr[i * j]++;
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int max = Integer.parseInt(br.readLine());
			for (int b = max / 2; b < max; b++) {
				if (arr[b] == 0 && arr[max - b] == 0) {
					System.out.println(max - b + " " + b);
					break;
				}
			}
		}
	}
}
