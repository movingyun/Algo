package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

//22.03.19
//팀을 조합(visit if)으로 고르고 배열을 돌면서 체크
//min초기화
public class BaekJoon_14889_S2_스타트와링크 {
	static int all;
	static int[][] arr;
	static int[] visit;
	static int[] result;
	static int[] person;
	static int pick;
	static int min = 111110;
	
	//main함수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		all = sc.nextInt();
		pick = all / 2;
		arr = new int[all][all];
		person = new int[all];
		for (int i = 0; i < all; i++) {
			person[i] = i + 1;
		}
		visit = new int[all];
		result = new int[pick];
		for (int i = 0; i < all; i++) {
			for (int j = 0; j < all; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		recur(0);
		System.out.println(min);
	} // main함수
	
	//팀 조합을 찾는 함수
	public static void recur(int dept) {
		// 끝내
		if (dept >= pick) {
			//teamSum함수를 이용해서 두 팀의 차를 구하고
			int answer = teamSum(result);
			//min보다 작으면 초기화시킴
			if(answer<min)
				min = answer;
			return;
		}
		// 재귀
		for (int i = 0; i < all; i++) {
			if (visit[i] == 1) {
				continue;
			}
			if (dept != 0 && result[dept - 1] > person[i])
				continue;
			else {
				visit[i] = 1;
				result[dept] = person[i];
				recur(dept + 1);
				visit[i] = 0;
			}
		}
	}
	
	//두 팀간의 차를 구하는 함수
	public static int teamSum(int[] result) {
		int answer = 0;
		int sum1 = 0; // pick당한 합
		int sum2 = 0; // pick 안당한 합
		for (int j = 0; j < all; j++) {
			for (int q = 0; q < all; q++) {
				int flag =0;
				for (int k = 0; k < pick; k++) {
					if (q + 1 == result[k] || j + 1 == result[k]) {
						flag++;
					}
				} // 있는지 확인하기
				//flag==2는 선택당한 사람이란 뜻!
				if(flag==2) {
					sum1 += arr[j][q];
				}
				if(flag==0) {
					sum2 += arr[j][q];
				}
			} // col돌기
		} // row돌기
		answer = Math.abs(sum2-sum1);
		return answer;
	}
}