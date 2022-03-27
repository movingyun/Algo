package BaekJoon;

import java.util.Scanner;

public class BaekJoon_20492_세금 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print((int)(a*0.78) + " ");
		System.out.println((int)((a*0.8)+(a*0.2*0.78)));
		
	}
}
