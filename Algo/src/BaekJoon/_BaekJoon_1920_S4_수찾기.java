package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// 22.03.08
// 정답지를 string으로 만들고 찾을 수를 contain하고있는지 확인 -> 메모리초과..
// 정렬하고 이분탐색으로 있는지 찾아보는 방법 확인...
public class _BaekJoon_1920_S4_수찾기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int[] num = new int[a]; // 정답지
		StringTokenizer st = new StringTokenizer(br.readLine() + " ");
		for (int i = 0; i < a; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);

		int b = Integer.parseInt(br.readLine());
		int[] find = new int[b]; // 찾아야되는 수
		st = new StringTokenizer(br.readLine() + " ");
		for (int i = 0; i < b; i++) {
			find[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(find);

		//이분탐색
		for(int j=0; j<b; j++) {
			for(int i= a/2; ; ) {
				if(num[i]==find[j]) {
					System.out.println(1);
					break;
				}
				if(num[i]>find[j]) {
					i--;
				}
					
			}		
		}

		
//		System.out.println(Arrays.toString(num));
//		System.out.println(Arrays.toString(find));

	}
}
