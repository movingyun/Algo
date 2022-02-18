package SWEA;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_1223_계산기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			sc.nextInt();// 그냥 버린다
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

//				덧셈이니?
				else if (ch == '+') {
					// 누가 있으면 다 빼서 출력하고 나를 스택에 넣는다.
					if (!stack.isEmpty()) {
						while (!stack.isEmpty() && stack.peek() != '(') {
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
						while (!stack.isEmpty() && stack.peek() == '*') {
							sb.append(stack.pop());
						}
					}
					stack.push(ch);
				}
			}
			while (!stack.isEmpty())
				sb.append(stack.pop());
//			System.out.println(sb.toString());

			String postFixExpr = sb.toString();
			// 계산로직..
			// 숫자면 스택에 푸쉬
			// 연산자면 두개 팝해서 연산
			Stack<Integer> calStack = new Stack<Integer>();
			for (int i = 0; i < postFixExpr.length(); i++) {
				char ch = postFixExpr.charAt(i);
				if (Character.isDigit(ch)) {
					calStack.push(ch - '0');
				} else {
					int num2 = calStack.pop();
					int num1 = calStack.pop();
					int result = 0;
					switch (ch) {
					case '+':
						result = num1 + num2;
						break;

					case '*':
						result = num1 * num2;
						break;
					}
					calStack.push(result);

				}
			}
			System.out.println("#" + tc + " " + calStack.pop());
		}
	}
}
