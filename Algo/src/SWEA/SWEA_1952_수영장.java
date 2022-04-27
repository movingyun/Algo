package SWEA;

import java.util.Scanner;

public class SWEA_1952_수영장 {
	static int[] price;
	static int[] plan;
	static int min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			price = new int[4];
			plan = new int[13];
			for (int i = 0; i < 4; i++) {
				//1일 - 1달 - 3달 - 1년
				price[i] = sc.nextInt();
			}
			for (int i = 1; i < 13; i++) {
				plan[i] = sc.nextInt();
			}
			min = price[3]; //1년치가 가장 싼걸로 초기화
			dfs(1, 0);
			System.out.printf("#%d %d\n", tc, min);
		}
	}// main함수

	public static void dfs(int month, int sum) {
		//끝
		if(month>12) {
			if(sum<min) min = sum;
			return;
		}
		//재귀
		//1일권
		dfs(month+1, sum+(plan[month]*price[0]));
		//1달권
		dfs(month+1, sum+price[1]);
		//3달권
		dfs(month+3, sum+price[2]);
	}// dfs함수
}
