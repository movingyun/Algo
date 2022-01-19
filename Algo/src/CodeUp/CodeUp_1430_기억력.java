package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1430_기억력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int num = sc.nextInt();
		int[] num_arr = new int[num];

		for (int i = 0; i < num; i++) {
			num_arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
	
		for(int i=0; i<num; i++)
			if(Arrays.binarySearch(arr, num_arr[i])>=0)
				System.out.println(1);
			else System.out.println(0);
	}
}
