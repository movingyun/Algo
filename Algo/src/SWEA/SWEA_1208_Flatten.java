package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SWEA_1208_Flatten {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[100];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 100; i++) {// arr에 높이 입력
//				arr[i] = sc.nextInt();
				arr[i] = Integer.parseInt( st.nextToken());
			}
			int result = 0; //결과값
			for (int i = 0; i < N; i++) {
				Arrays.sort(arr); //매번 정렬
				if (arr[99] > arr[0]) { // 최대값이 최소값보다 크면
					arr[99]--; // 최대--
					arr[0]++; //최소++
				}
			}
			Arrays.sort(arr); //마지막 정렬하고
			result = arr[99] - arr[0]; //차이를 구함
			System.out.println("#" + tc + " " + result);
		}
	}
}
