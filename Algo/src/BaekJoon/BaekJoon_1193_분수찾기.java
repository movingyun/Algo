package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1193_분수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String result;
		int x = 1;
		int y = 1;
		int box = 0;
		
		for(int c = 1; c==a; c++) {
			for(int i=1; i==c; i++) {
				result = x + "/" + y;
				x++;
				System.out.println(result);
			}
			box=y;
			y=x;
			x=box;
			}
		

		}

	}
