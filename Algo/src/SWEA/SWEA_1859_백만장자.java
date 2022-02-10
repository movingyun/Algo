package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1859_백만장자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int day = sc.nextInt();
			int[] price = new int[day];
			int buyCnt = 0;
			int buyPay = 0;
			int selCnt = 0;
			int selPay = 0;
			for(int i=0; i<day; i++) {
				price[i] = sc.nextInt();				
			}
			for(int i=0; i<day-1; i++) {
				
				int[] new_arr = Arrays.copyOfRange(price, i+1, price.length-1);
			}

			
			int result = selPay-buyPay;
			System.out.printf("#%d %d",tc,result);

		}
	}
}
