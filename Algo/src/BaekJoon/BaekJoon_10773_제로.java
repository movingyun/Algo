package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

//22.02.22 스택을 활용해서 0이 나오면 pop
public class BaekJoon_10773_제로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> arr = new Stack<Integer>();
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			if (b != 0) {
				arr.push(b);
				sum += b;
			} else {
				sum -= arr.peek();
				arr.pop();
			}
		}
		System.out.println(sum);
	}
}
