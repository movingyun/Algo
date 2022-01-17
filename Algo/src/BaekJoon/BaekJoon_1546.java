package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		double ans = 0;
		int n=sc.nextInt();
		double[] arr = new double[n];
		
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		double M = arr[n-1];
		for(int i=0; i<n; i++) {
			sum += arr[i]; 
		}
		ans = (sum*100/M)/n;
		System.out.println(ans);
		
	}
}
