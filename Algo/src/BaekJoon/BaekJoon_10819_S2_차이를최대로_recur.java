package BaekJoon;

//22.03.18
// 걍 재귀로 뽑아보자
// 중복x 순서상관0 -> 중복이 안되는 순열
// visit쓰고 if문 안쓰고
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10819_S2_차이를최대로_recur {

	static int a;
	static int[] arr;
	static int[] visit;
	static int[] result;
	static int sum = 0;
	static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		arr = new int[a];
		result = new int[a];
		visit = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		recur(0);
		System.out.println(max);
	}

	public static void recur(int dept) {
		// 그만하자
		if (dept >= a) {
			sum = 0;
			for (int i = 1; i < a; i++) {
				sum += Math.abs(result[i] - result[i - 1]);
			}
			if (max < sum)
				max = sum;
//			System.out.println();
		}

		// 재귀
		for (int i = 0; i < a; i++) {
			if (visit[i] == 1) {
				continue;
			} else {
				visit[i] = 1;
				result[dept] = arr[i];
				recur(dept + 1);
				visit[i] = 0;
			}

		}
	}
}
