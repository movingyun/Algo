package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon_10828_S4_스택 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch (s) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				stack.push(num);
				break;
			case "pop":
				if(stack.isEmpty())
					sb.append(-1+" \n");
				else {
					sb.append(stack.pop()+" \n");
				}
				break;
			case "size":
				sb.append(stack.size()+" \n");
				break;
			case "empty":
				if(stack.isEmpty())
					sb.append(1+" \n");
				else
					sb.append(0+" \n");
				break;
			case "top":
				if(stack.isEmpty())
					sb.append(-1+" \n");
				else
					sb.append(stack.peek()+" \n");
				break;
			}
		}
		System.out.println(sb);
	}
}
