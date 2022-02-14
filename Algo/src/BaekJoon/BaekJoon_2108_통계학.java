package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2108_통계학 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		int sum = 0;
		int[] cnt = new int[8001];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			cnt[arr[i]+4000]++;
		}
		Arrays.sort(arr);
		int max=0;
		int result = 0;
		int flag =0;
		for(int i=0; i<8001; i++) {
			if(cnt[i]>max) {
				max=cnt[i];
				result=i;
				flag = 1;
			}
			else if(cnt[i]==max&&flag==1) {
				result=i;
				flag =0;
			}
				
			
		}
		System.out.printf("%.0f\n", sum / (double)T);
		System.out.println(arr[T / 2]);
		System.out.println(result-4000);
		System.out.println(arr[T - 1] - arr[0]);
	}
}
