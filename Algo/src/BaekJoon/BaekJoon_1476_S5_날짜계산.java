package BaekJoon;

import java.util.Scanner;

//22.03.02
// cnt를 1, 배열은 {1,1,1}로 시작했더니 {1,1,1}을 찾는거에서 1이 안나오고
// 두번째 답인 7000대가 나옴
public class BaekJoon_1476_S5_날짜계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = {0,0,0};
		
		int cnt = 0;
		for(;;) {
			arr[0]++;
			arr[1]++;
			arr[2]++;
			cnt++;
			if((arr[0]-1)%15+1==a&&(arr[1]-1)%28+1==b&&(arr[2]-1)%19+1==c) {
				break;				
			}
		}
		System.out.println(cnt);
	}
}
