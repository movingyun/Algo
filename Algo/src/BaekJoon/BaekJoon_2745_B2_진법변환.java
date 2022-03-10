package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

//22.03.08
// 알파벳이 올때와 숫자가 올때를 구분하고
// 해당하는 값이 될 수 있도록 적절한 값을 빼준 후
// for문을 활용하여 sum에 한 자리씩 계산해서 더한다.
public class BaekJoon_2745_B2_진법변환 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// A : 65, Z : 90, 1 : 49
		String a = sc.next();
		int b = sc.nextInt();
		char[] arr = a.toCharArray();
		int num = 0;
		int sum = 0;
		int num2 = 0; // 윗 수
		for (int i = arr.length - 1; i >= 0; i--) {
			if ((int) arr[i] < 65)
				num = (int) arr[i] - 48;
			else
				num = (int) arr[i] - 55;
			sum += num * Math.pow(b, num2);
			num2++;
		}
		System.out.println(sum);
	}
}
