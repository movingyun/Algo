package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

//22.02.25
//스택 활용해서 ([{< 들어오면 스택에 넣어주고 닫는괄호 들어오면 판단 시작.
public class BaekJoon_9012_S4_괄호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String result = "YES";
			Stack<String> stack = new Stack<String>();
			String s = sc.next();
			for (int i = 0; i < s.length(); i++) {

				if ("([{<".contains(Character.toString(s.charAt(i)))) {
					stack.add(Character.toString(s.charAt(i)));
				}

				else if (")".contains(Character.toString(s.charAt(i)))) {
					if (!stack.isEmpty() && "(".contains(stack.peek()))
						stack.pop();
					else {
						result = "NO";
						break;
					}
				} else if ("]".contains(Character.toString(s.charAt(i)))) {
					if (!stack.isEmpty() && "[".contains(stack.peek()))
						stack.pop();
					else {
						result = "NO";
						break;
					}
				} else if ("}".contains(Character.toString(s.charAt(i)))) {
					if (!stack.isEmpty() && "{".contains(stack.peek()))
						stack.pop();
					else {
						result = "NO";
						break;
					}
				} else if (">".contains(Character.toString(s.charAt(i)))) {
					if (!stack.isEmpty() && "<".contains(stack.peek()))
						stack.pop();
					else {
						result = "NO";
						break;
					}
				}
			}
			if (!stack.isEmpty())
				result = "NO";
			System.out.println(result);
		}
	}
}

