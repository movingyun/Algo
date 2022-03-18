package BaekJoon;

import java.util.Scanner;
//22.03.18
//값을 넣으면서 동시에 flag를 활용해서 그게 내가 찾아야될
//우유가겐지 확인.
public class BaekJoon_14720_B3_우유축제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		int flag = 0;
		int cnt = 0;
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == flag % 3) {
				cnt++;
				flag += 1;
			}
		}
		System.out.println(cnt);
	}
}
