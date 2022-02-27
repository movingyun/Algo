package BaekJoon;

import java.util.List;
import java.util.Scanner;

//22.02.24
//신발끈법칙 이용해서 풀어보자!!
public class BaekJoon_2477_S4_참외밭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] xList = new int[6];
		int[] yList = new int[6];

		int x = 0;
		int y = 0;
		
		//6개 좌표 구하기
		for (int i = 0; i < 6; i++) {
			switch (sc.nextInt()) {
			//1이나오면 좌표가 오른쪽으로 간다.(x+)
			case 1:
				int ch1 = sc.nextInt();
				x += ch1;
				xList[i] = x;
				yList[i] = y;
				break;
				
			//2가나오면 좌표가 왼쪽으로 간다.(x-)
			case 2:
				int ch2 = sc.nextInt();
				x -= ch2;
				xList[i] = x;
				yList[i] = y;
				break;
				
			//3이나오면 좌표가 아래쪽으로 간다.(y-)
			case 3:
				int ch3 = sc.nextInt();
				y -= ch3;
				xList[i] = x;
				yList[i] = y;
				break;
				
			//4가나오면 좌표가 위로 올라간다.(y+)
			case 4:
				int ch4 = sc.nextInt();
				y += ch4;
				xList[i] = x;
				yList[i] = y;
				break;
			}
		}
		
		long sum1 = 0;
		long sum2 = 0;
		// 신발끈 x*(y+1)
		for (int i = 0; i < 6; i++) {
			if (i == 5)
				sum1 += xList[5] * yList[0];
			else if (i != 5)
				sum1 += xList[i] * yList[i+1];
		}
		// 신발끈 y*(x+1)
		for (int i = 0; i < 6; i++) {
			if (i == 5)
				sum2 += xList[0] * yList[5];
			else if (i != 5)
				sum2 += yList[i] * xList[i+1];
		}
		
		int a = (int) Math.abs(sum1 - sum2);
		System.out.print(a/2*num);

	}
}
