package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1193_분수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int cnt = 0;
		int t = 0;
		for (int i = 1; a > (i * (i + 1)) / 2; i++) {
			t = i + 1;
			cnt = (t * (t + 1)) / 2;
		}

		String result = null;
		if(a==1)
			result = 1+"/"+1;
		else if (t % 2 == 0)
			result = ((t) - (cnt - a)) + "/" + (1 + (cnt - a));
		else if (t % 2 != 0)
			result = (1 + (cnt - a)) + "/" + ((t) - (cnt - a));
		System.out.println(result);

	}

}
