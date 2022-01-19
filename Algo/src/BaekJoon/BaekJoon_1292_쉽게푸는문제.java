package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1292_쉽게푸는문제 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[1000];
	int cnt=0;
	
	for(int i = 1; i<50; i++) {
		for(int j = 1; j<=i; j++) {
			if(cnt>=1000)
				break;			
			arr[cnt]=i;
			cnt++;

		}
	}
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	int[] result = Arrays.copyOfRange(arr, a-1, b);

	int sum = Arrays.stream(result).sum();
	System.out.println(sum);
	
	
//	for(int i=0;i<result.length;i++)
//		System.out.println(result[i]);
	
}
}
