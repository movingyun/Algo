package SWEA;

import java.util.Scanner;

public class SWEA_3431_준환이의운동관리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int l = sc.nextInt();
			int u = sc.nextInt();
			int x = sc.nextInt();
			int result = 0;

			if (x >= l) { // 최저치보다 많이 했을 떄
				if (x <= u) // 최대치보다 적게하면
					result = 0;
				else // 최대치보다 많이하면
					result = -1;
			} else // 최저치보다 못하면
				result = l - x;
			System.out.println("#" + tc + " " + result);
		}
	}
}
