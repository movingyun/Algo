package SWEA;

import java.util.Scanner;

public class SWEA_6730_장애물경주 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {//T번 테스팅
			int a = sc.nextInt();
			int[] arr = new int[a];
			for (int i = 0; i < a; i++) {//장애물높이 입력
				arr[i] = sc.nextInt();
			}
			int max_up = 0; //변수생성
			int max_down = 0;
			for (int i = 0; i < a - 1; i++) { //마지막-1번째까지
				if (arr[i] < arr[i + 1]) { //다음 장애물이 높은데
					if (max_up < arr[i + 1] - arr[i]) // 올라가는 최대치보다 더 많이 올라가면
						max_up = arr[i + 1] - arr[i]; // 최대치 갱신
				}
				else if (arr[i] > arr[i + 1]) { // 다음 장애물이 낮은데 
					if (max_down < arr[i] - arr[i + 1]) // 내려가는 최대치보다 더 낮게 내려가면
						max_down = arr[i] - arr[i + 1]; // 최대치 갱신
				}
			}
			System.out.println("#" + tc + " " + max_up + " " + max_down);
		}
	}
}
