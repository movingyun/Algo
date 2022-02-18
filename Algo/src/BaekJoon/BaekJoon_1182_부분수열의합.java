package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_1182_부분수열의합 {
	static List<Integer> arr = new ArrayList<Integer>();
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int i = 0; i < a; i++) {
				arr.add(sc.nextInt());
			}
			recur(a, b, 0, 0);
			if(b==0)
				cnt-=1;
			System.out.println(cnt);
	}

	static void recur(int a, int b, int n, int sum) {
		// 이제 그만 두는 파트
		if (n == a) {
			if (sum == b)
				cnt++;
			return;
		}
		recur(a, b, n + 1, sum + arr.get(n));
		recur(a, b, n + 1, sum);
	}
}