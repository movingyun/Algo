package BaekJoon;

import java.util.Scanner;

public class BaekJoon_5522_카드게임{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0;
		for(int i=0; i<5; i++) {
			
			num += sc.nextInt();
		}
		System.out.println(num);
	}
}
