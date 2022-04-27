package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10797_B4_차량10부제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		for(int i=0; i<5; i++) {
			if(a==sc.nextInt())
				sum++;
		}
		System.out.println(sum);
		
	}
}
