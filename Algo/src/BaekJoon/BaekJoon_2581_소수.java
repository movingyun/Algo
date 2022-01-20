package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2581_소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int min = 0;
		int sum = 0;

		for (int i = b; i >= a; i--) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && i !=2) {
					break;}
				if (i==2 || j == i - 1) {
					sum += i;
					min = i;}
			}
		}
		if(sum!=0) {
		System.out.println(sum);
		System.out.println(min);}
		if(sum==0)
			System.out.println(-1);
	}
}
