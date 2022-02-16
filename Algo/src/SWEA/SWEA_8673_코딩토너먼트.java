package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_8673_코딩토너먼트 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int tc =1; tc<=T; tc++){
		int a =sc.nextInt();
		int num = a;

		int sum =0;
		int[] arr = new int[(int)Math.pow(2, a)];
		int[] arr_win = new int[(int)Math.pow(2, a)];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<a; i++) {
			int num2 = 0;
			for(int j=0; j<Math.pow(2, num); j++) {
				sum+=Math.abs(arr[j]-arr[j+1]);
				arr[num2] = (arr[j]>=arr[j+1])? arr[j] : arr[j+1];
				j++;
				num2++;
			}
			num--;
		}
		System.out.printf("#%d %d\n",tc,sum);
	}
}
}
