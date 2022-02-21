package BaekJoon;

import java.util.Scanner;
import java.util.Stack;
//스택활용해서 하나씩 넣어가면서 늘리고 만약 스택의 제일 위에값이 배열의 값과 같다면 -출력 후 pop
// 반례 : 3 3 1 2
//22.02.22
public class BaekJoon_1874_스택수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int num = 1;
		int loc = 0;
		Stack<Integer> arr = new Stack<Integer>();
		int[] ans = new int[a];

		for (int i = 0; i < a; i++) {
			ans[i] = sc.nextInt();
		}

		out : for (int i = 1; i < 2 * a; i++) {
			arr.push(num);
			sb.append("+");
			num++;
			while (arr.peek().equals(ans[loc])) {
				sb.append("-");
				arr.pop();
				loc++;
				if(loc==a)
					break out;
				if(arr.isEmpty())
					break;
			}
		}
		if (arr.isEmpty()&&sb.length()==2*a)
		for (int i = 0; i < sb.length(); i++) {
			System.out.println(sb.charAt(i));
		}
		else
			System.out.println("NO");
	}
}
