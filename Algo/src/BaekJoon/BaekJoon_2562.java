package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];

		int loc = 1;
		int max = -100000;

		for (int i = 0; i != 9; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i=0; i!=9; i++) {
			if(arr[i]!=max) {
				loc++;
			}
			else {
				break;
			}
		}
		
		System.out.println(max);
		System.out.println(loc);
	}
}
