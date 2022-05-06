package BaekJoon;

import java.io.IOException;
import java.util.Scanner;

//조합으로 하면 시간초과.....

public class BaekJoon_12865_G5_평범한배낭 {

	static int all, maxWeight, result, totalHappy;
	static int[] happyArray;
	static int[] bag;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		all = sc.nextInt(); //물건 수
		maxWeight = sc.nextInt(); // 버틸 수 있는 무게
		bag = new int[all]; //가방 배열
		happyArray = new int[all]; //행복감
		totalHappy = 0;
		for (int i = 0; i < all; i++) {
			bag[i] = sc.nextInt();
			happyArray[i] = sc.nextInt();
			totalHappy += happyArray[i];
		}
		result = 0;
		pick(0, 0, totalHappy, 0);
		System.out.println(result);
	}

	static void pick(int idx, int weight, int lastHappy, int happy) {
		//무게 넘어가면 그만
		if (weight > maxWeight)
			return;
		//다 뽑아도 들 행복하면 그만
		if (happy + lastHappy < result)
			return;
		if (idx >= all) {
			if (happy > result)
				result = happy;
			return;
		}
		// 뽑고가
		pick(idx + 1, weight + bag[idx], lastHappy - happyArray[idx], happy+happyArray[idx]);
		// 안뽑고가
		pick(idx + 1, weight, lastHappy - happyArray[idx], happy);
	}
}
