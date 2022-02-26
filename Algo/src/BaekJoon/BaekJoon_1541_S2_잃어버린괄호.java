package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

//22.02.25
//- 나오면 괄호가 있다고 생각하고 -가 다시 나올때 까지 +한다.
//00009를 9로 인식할 방법 필요 -> stack에 하나씩 넣어두다가 10의 size승 만큼 곱하면서 더함
// -->> 첫째 수만 +이고 뒤에 나오는 수들은 다 -로 계산한다.
// 1. -기준으로 나눈다.
// 2. arr[1]부터 끝까지는 다 minus변수에 더해준다.
// 3. arr[0]을 +기준으로 나누고 sum변수에 더해준다.
// 4. result = sum-minus!
public class BaekJoon_1541_S2_잃어버린괄호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int sum = 0;
		int minus = 0;

		String[] arr = num.split("-");
//		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			String[] minus_arr = arr[i].split("\\+");
			for (int j = 0; j < minus_arr.length; j++) {
				minus += Integer.parseInt(minus_arr[j]);
			}
		}

		String[] sum_arr = arr[0].split("\\+");
		for (int j = 0; j < sum_arr.length; j++) {
			sum += Integer.parseInt(sum_arr[j]);
		}

		System.out.println(sum - minus);
	}
}
