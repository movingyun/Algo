package BaekJoon;

import java.util.Scanner;

public class BaekJoon_9095_S3_123더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i <= 10; i++){
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        for(int t = 1; t <= T; t++){
            int a = sc.nextInt();
            System.out.println(dp[a]);
        }
    }
}