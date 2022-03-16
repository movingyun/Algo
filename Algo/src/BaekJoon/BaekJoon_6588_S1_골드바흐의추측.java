package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//22.03.16
//짝수 = 소수인 홀수 + 소수인 홀수
//num이 백만까지 들어올수 있는데 10만으로 잘못봐서 계속 arrayOutOfIndex에러 남...
public class BaekJoon_6588_S1_골드바흐의추측 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[1000001];
		arr[1] = 1;
		arr[0] = 1;
		for (int j = 2; j < 1000000; j++) {
			for (int i = 2; j * i <= 1000000; i++) {
				if (arr[i * j] == 0) {
					arr[i * j]++;
				}
			}
		}
//		int t = Integer.parseInt(br.readLine());
		for (;;) {
			int max = Integer.parseInt(br.readLine());
			if (max == 0)
				break;
			for (int b = 0; b < max / 2 + 1; b++) {
				if (arr[b] == 0 && arr[max - b] == 0) {
					System.out.printf("%d = %d + %d\n", max, b, max - b);
					break;
				}
			}
		}
	}
}
