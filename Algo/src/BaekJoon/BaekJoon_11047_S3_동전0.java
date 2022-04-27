package BaekJoon;

import java.util.Scanner;

public class BaekJoon_11047_S3_동전0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int price = sc.nextInt();
		int[] arr = new int[num];
		int max = 0;
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<=price) max= i;
		}
		int cnt = 0;
		while(price%arr[max]!=0) {
			if(price<arr[max]) {
				max--;
				continue;
			}
			cnt += price/arr[max];
			price %= arr[max];
			max--;
		}
		cnt += price/arr[max];
		System.out.println(cnt);
	}
}
