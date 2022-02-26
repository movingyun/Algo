package BaekJoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 22.02.25
// 1차시도 : 시작시간 순으로 정렬해서 센다... for문 3개나와서 시간초과
// 2차시도 : 종료시간 순으로 정렬 count -> 성공!!

public class BaekJoon_1931_S2_회의실배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] arr = new int[a][2];
		for (int i = 0; i < a; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		// 2차원 배열 정렬
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		
		//정렬 잘 됐나 확인.
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//그 다음 시작시간이 종료시간 뒤에있으면 cnt++하고 시작시간 최신화
		int cnt=0;
		int num =0;
		for(int i=0; i<a; i++) {
			if(num<=arr[i][0]) {
				cnt++;		
				num=arr[i][1];
			}
		}
		System.out.println(cnt);
	}
}
