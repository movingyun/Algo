package BaekJoon;

import java.util.Scanner;

public class BaekJoon_11726_S3_2xn타일링 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// dp[n] = dp[n-1]+dp[n-2]
		long[] dp = new long[n + 1];
		dp[1] = 1;
		if(n>=2) dp[2] = 2;
		if (n >= 3) {
			for (int i = 3; i <= n; i++) {
				dp[i] = (dp[i - 1] + dp[i - 2])%10007;
//				System.out.printf("dp[%d] = %d\n",i,dp[i]);
			}
		}
		System.out.println(dp[n]);
	}
}
