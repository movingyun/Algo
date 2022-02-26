package SWEA;

import java.util.Scanner;
import java.util.Stack;

//22.02.25
//스택 활용해서 ([{< 들어오면 스택에 넣어주고 닫는괄호 들어오면 판단 시작.
public class SWEA_1218_괄호짝짓기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int a = sc.nextInt();
			int result = 1;
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
						result = 0;
						break;
					}
				} else if ("]".contains(Character.toString(s.charAt(i)))) {
					if (!stack.isEmpty() && "[".contains(stack.peek()))
						stack.pop();
					else {
						result = 0;
						break;
					}
				} else if ("}".contains(Character.toString(s.charAt(i)))) {
					if (!stack.isEmpty() && "{".contains(stack.peek()))
						stack.pop();
					else {
						result = 0;
						break;
					}
				} else if (">".contains(Character.toString(s.charAt(i)))) {
					if (!stack.isEmpty() && "<".contains(stack.peek()))
						stack.pop();
					else {
						result = 0;
						break;
					}
				}
			}
			if (!stack.isEmpty())
				result = 0;
			System.out.println("#" + tc + " " + result);
		}
	}
}
