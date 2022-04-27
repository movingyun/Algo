package BaekJoon;

import java.util.Scanner;

//야매로 풀었음..
//다 순서대로 그래프로 연결되어있으니까 최소구간 = 국가 수-1
public class BaekJoon_9372_S3_상근이의여행 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int nation = sc.nextInt();
			int plan = sc.nextInt();
			for(int i=0; i<plan; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
			}
			System.out.println(nation-1);			
		}
	}

}
