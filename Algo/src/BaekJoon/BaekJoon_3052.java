package BaekJoon;

import java.util.Scanner;

public class BaekJoon_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int[] lea = new int[42];
		int a = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			lea[arr[i]%42]+=1;
		}
		
		for(int i=0; i<lea.length; i++) {
			if(lea[i]>0)
				a+=1;
		}
		System.out.println(a);		
	}
}
