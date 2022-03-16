package BaekJoon;

import java.util.Scanner;

//22.03.10
//DP문제 처음 풀어본다....
//나를 만들기 위해서는 어떤 방법이 있는지 생각해보자!!
public class BaekJoon_2579_S3_계단오르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a+1];
		int[] dp = new int[a+1];
		for (int i = 1; i < a+1; i++) {
			arr[i] = sc.nextInt();
		}
		
		//n이 작을때는 예외처리
		dp[1] = arr[1];
		if(a>=2)
		dp[2] = arr[1]+arr[2];
		
		//n이 3부터
		//n번째 계단을 밟으려면 2가지 경우의 수
		//1. n-1을 밟고 n을 밟을때
		//dp[n-3]까지 더하고 arr[n-1] + arr[n]
		
		//2. n-2를 밟고 n을 밟을때
		//dp[n-2]까지 더하고 arr[n]
		
		//두가지 경우의 수 중 큰거 사용
		for(int i=3; i<a+1; i++) {
			dp[i] = Math.max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i]);
		}
		System.out.println(dp[a]);
	}
}
