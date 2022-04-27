package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _BaekJoon_9205_S1_맥주마시면서걸어가기 {
	static int shopCnt;
	static List<pos> route;
	static int[][] shop;
	static int[] visit;
	static int[] result;
	static int flag = 0;
	static pos house;

	static class pos {
		int r, c;

		public pos(int r, int c) {
			this.r = r;
			this.c = c;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			shopCnt = sc.nextInt();
			route = new ArrayList<pos>();
			shop = new int[shopCnt][2];
			result = new int[shopCnt];
			visit = new int[shopCnt];
			flag = 0;
			// 루트 만들기
			pos pos = new pos(sc.nextInt(), sc.nextInt());
			route.add(pos);
			for (int i = 0; i < shopCnt; i++) {
				shop[i][0] = sc.nextInt();
				shop[i][1] = sc.nextInt();
			}
			house = new pos(sc.nextInt(), sc.nextInt());
			per(0, 0);
			if (flag == 1)
				System.out.println("happy");
			else
				System.out.println("sad");

		} // tc 끝
	}// main 끝

	public static void per(int dept, int sum) {
		if (sum > 1000)
			return;

		// 끝내
		if (dept == shopCnt) {
			route.add(house);
			for(int i=0; i<dept+2; i++) {
				System.out.println(route.get(i).r + " " + route.get(i).c);
			}
			sum = Math.abs(route.get(dept).r-route.get(dept+1).r)
					+ Math.abs(route.get(dept).c-route.get(dept+1).c);
			if(sum<=1000)
				flag = 1;
			return;
		}
		// 재귀
		for (int i = 0; i < shopCnt; i++) {
			if (visit[i] == 1)
				continue;
			else {
				visit[i] = 1;
				pos pos = new pos(shop[i][0], shop[i][1]);
				route.add(pos);
				per(dept + 1, (Math.abs(route.get(dept).r-route.get(dept+1).r)
						+ Math.abs(route.get(dept).c-route.get(dept+1).c)));
				visit[i] = 0;
			}
		}
	}// per끝
}
