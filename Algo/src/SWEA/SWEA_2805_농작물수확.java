package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2805_농작물수확 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int sum = 0;
			int a = sc.nextInt(); 
			char[][] arr_s = new char[a][a]; //String을 char로 변환해서 넣을 배열 생성
			for (int i = 0; i < a; i++) {
				String c = sc.next(); //String 입력받음
				arr_s[i] = c.toCharArray(); //char로 변환해서 배열에 넣음
			}
			
			for (int i = 0; i <= a / 2; i++) {//i가 a/2까지 커진다. a/2에서 정점을 찍고 2칸씩 줄어든다.
				for (int j = a / 2 -i; j!=a/2+i+1 ; j++) {
					sum += arr_s[i][j]-48;
				}
			}

			for (int i = a / 2 + 1; i < a; i++) {
				for (int j = i-a/2; j < (a / 2)-i + a; j++) {
					sum += arr_s[i][j]-48;
				}
			}
			System.out.printf("#%d %d\n", tc, sum);
		}
	}
}
