package BaekJoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

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

//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
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
