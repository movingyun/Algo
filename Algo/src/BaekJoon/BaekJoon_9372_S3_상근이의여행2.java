package BaekJoon;

import java.util.Scanner;

//제대로 풀어봐

public class BaekJoon_9372_S3_상근이의여행2 {
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
