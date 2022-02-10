package SWEA;

import java.util.Scanner;

public class SWEA_2058_자리수더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		while (a > 9) {
			sum += a%10;
			a = a/10;
		}
		sum+=a;
		System.out.println(sum);
	}
}
