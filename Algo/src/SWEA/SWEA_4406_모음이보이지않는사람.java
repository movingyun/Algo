package SWEA;

import java.util.Scanner;

public class SWEA_4406_모음이보이지않는사람 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char[] aeiou = { 'a', 'e', 'i', 'o', 'u' }; //모음 배열 생성
		for (int tc = 1; tc <= T; tc++) {
			String a = sc.next();// String 입력
			char[] arr = a.toCharArray(); //char배열로 변환

			System.out.printf("#%d ", tc);
			for (int i = 0; i < arr.length; i++) { //char배열 하나씩 확인
				int flag = 1;
				for (int j = 0; j < 5; j++) {
					if (arr[i] == aeiou[j])//모음 배열 중 하나라도 겹치면 flag=0할당
						flag = 0;
				}
				if (flag == 1) //겹치는게 없으면 출력
					System.out.print(arr[i]);
			}
			System.out.println();
		}
	}
}
