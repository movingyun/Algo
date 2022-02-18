package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_1918_후위표기식 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expr = sc.next();
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < expr.length(); i++) {
			char ch = expr.charAt(i); // 한글자씩 접근

			// 숫자니?
			if (ch > 48) {
				sb.append(ch);
			}
			// 여는괄호니?
			else if (ch == '(') {
				stack.push(ch);
			}

			// 닫는괄호니?
			else if (ch == ')') {
				while (stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			}
			// 뺄셈이니?
			else if (ch == '-') {
				// 누가 있으면 다 빼서 출력하고 나를 스택에 넣는다.
				if (!stack.isEmpty()) {
					while (!stack.isEmpty() && stack.peek() != '(') {
						sb.append(stack.pop());
					}
				}
				stack.push(ch);
			}

			// 덧셈이니?
			else if (ch == '+') {
				// 누가 있으면 다 빼서 출력하고 나를 스택에 넣는다.
				if (!stack.isEmpty()) {
					while (!stack.isEmpty() && stack.peek() != '(') {
						sb.append(stack.pop());
					}
				}
				stack.push(ch);
			}

			// 나눗셈이니?
			else if (ch == '/') {
				if (!stack.isEmpty()) {
					while (!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) {
						sb.append(stack.pop());
					}
				}
				stack.push(ch);
			}

			// 곱셈이니?
			else if (ch == '*') {
				// 누가있는데, 덧셈이 아니라면 ---조건 1
				// 빼서 출력하고, 조건1이 아니면 나를 스택에 넣는다.
				if (!stack.isEmpty()) {
					while (!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) {
						sb.append(stack.pop());
					}
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty())
			sb.append(stack.pop());
		System.out.println(sb.toString());
	}
}
