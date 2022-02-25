package BaekJoon;

import java.util.Scanner;

public class _BaekJoon_2999_비밀이메일 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = sc.next();
		int N = msg.length();
		int r = 0;
		int c = 0;
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				r = i;
				c = N / i;
			}
		}
		//r행 c열
		int num=0;
		char[][] arr = new char[r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j] = msg.charAt(num);
				num++;
			}
		}
		System.out.println(r+" "+c);
		for(int j=0; j<c; j++) {
			for(int i=0; i<r; i++) {
				System.out.print(arr[i][j]);
			}
		}
		
	}
}