package BaekJoon;
import java.util.Scanner;

public class BaekJoon_1463_S3_1로만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] dp = new int[a + 1];
        for(int i = 2; i <= a; i++){
            dp[i] = dp[i - 1] + 1;
            if(i % 3 == 0)
            	dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
            if(i % 2 == 0)
                dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
        }
        System.out.println(dp[a]);
    }
}