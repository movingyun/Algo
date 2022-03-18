package BaekJoon;

import java.util.Scanner;

//22.03.18
//내가 다음거보다 작으면 가야할 거리만큼 기름을 사고 min을 나로유지
//만약 다음이 나보다 싸면 가야할 거리만큼 사고 min을 다음걸로 바꾸고 
//Int타입으로하면 58점만 나온다..
public class _BaekJoon_13305_S4_주유소 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int city = sc.nextInt();
		long[] dist = new long[city - 1];
		long[] price = new long[city];
		long sum = 0;
		long min = 0;

		for (int i = 0; i < city - 1; i++) {
			dist[i] = sc.nextLong();
		}

		for (int i = 0; i < city; i++) {
			price[i] = sc.nextLong(); //가격 입력
			if (i == 0) //맨 처음가격이 처음 min값
				min = price[i];

			if (i != city - 1) {//마지막 도시에서는 기름 안살거니까 제외
				if (price[i] < min) {//다음가격이 min보다 작음
					min = price[i]; //min최신화
				}
				sum += min * dist[i];
			}
		}
		System.out.println(sum);
	}
}
