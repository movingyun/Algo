package BaekJoon;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//22.03.25
//전체 시계수 list를 만들고 내 시계수가 몇번째인지 찾는다!
public class BaekJoon_2659_S3_십자카드문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}
		
		int e = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
		int f = arr[1] * 1000 + arr[2] * 100 + arr[3] * 10 + arr[0];
		int g = arr[2] * 1000 + arr[3] * 100 + arr[0] * 10 + arr[1];
		int h = arr[3] * 1000 + arr[0] * 100 + arr[1] * 10 + arr[2];

		int myCnum = Math.min(Math.min(e, f), Math.min(g, h));
//		System.out.println(myCnum);

		//시계수를 다 만들자
		Set<Integer> cnum = new LinkedHashSet();
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				for(int q=1; q<=9; q++) {
					for(int k=1; k<=9; k++) {
						int a = i * 1000 + j * 100 + q * 10 + k;
						int b = j * 1000 + q * 100 + k * 10 + i;
						int c = q * 1000 + k * 100 + i * 10 + j;
						int d = k * 1000 + i * 100 + j * 10 + q;

						int min = Math.min(Math.min(a, b), Math.min(c, d));
						cnum.add(min);
					}
				}
			}
		}
		
		//전체 시계수에서 몇번째?
		int cnt = 0;
		for(int i : cnum) {
			cnt++;
			if(i==myCnum)
				break;
		}
		System.out.println(cnt);
		


	}

}
