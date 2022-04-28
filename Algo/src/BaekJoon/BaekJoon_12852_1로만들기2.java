package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_12852_1로만들기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer>[] dp = new ArrayList[num + 5];
		for (int i = 0; i < num + 5; i++) {
			dp[i] = new ArrayList<Integer>();
			dp[i].add(i);
		}
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 2; i <= num; i++) {
			if (i % 6 == 0) {
				a = dp[i / 3].size();
				b = dp[i - 1].size();
				c = dp[i / 2].size();
				int min = Math.min(a, Math.min(b, c));
				if (min == a) {
					dp[i].addAll(dp[i / 3]);
				} else if (min == b) {
					dp[i].addAll(dp[i - 1]);
				} else {
					dp[i].addAll(dp[i / 2]);
				}
			} else if (i % 3 == 0) {
				a = dp[i / 3].size();
				b = dp[i - 1].size();
				if (a < b)
					dp[i].addAll(dp[i / 3]);
				else
					dp[i].addAll(dp[i - 1]);
			} else if (i % 2 == 0) {
				a = dp[i / 2].size();
				b = dp[i - 1].size();
				if (a < b)
					dp[i].addAll(dp[i / 2]);
				else
					dp[i].addAll(dp[i - 1]);
			} else {
				dp[i].addAll(dp[i - 1]);
			}
		}
		System.out.println(dp[num].size() - 1);
		for (int i = 0; i < dp[num].size(); i++) {
			System.out.print(dp[num].get(i) + " ");
		}
	}
}
