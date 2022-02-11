package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1859_백만장자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int day = sc.nextInt();
			int[] arr = new int[day];
			long sum = 0; //총 이득
			int price =0; // 현재 최고가
			for(int i=0; i<day; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=day-1; i>=0; i--) { //뒤에서부터 돈다
				int tmp =arr[i]; //현재가격
				if(price<=tmp) // 현재가격이 최고가보다 크면 최고가 갱신
					price=tmp;
				sum+=price-tmp; // 판매이익을 총 이득에 더해줌
			}
			System.out.printf("#%d %d\n",tc,sum);
		}
	}
}
