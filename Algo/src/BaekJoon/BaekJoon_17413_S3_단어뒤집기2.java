package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// 22.02.24
// stack 활용해서 단어는 stack에 넣어뒀다가 띄어쓰기,<만나면 sb에 붙혀
// <나오면 > 나올때까지 다 sb
// 띄어쓰기 나오면 stack에 있는거 꺼내서 sb
// 디버깅 : <나올때 i++안해줘서 힘들었음...
public class BaekJoon_17413_S3_단어뒤집기2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		char[] arr = new char[a.length()];
		arr = a.toCharArray();
//		System.out.println(Arrays.toString(arr));
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < arr.length; i++) {
			// 띄어쓰기 or <가 들어오기 전까지 stack에 쌓음
			if (arr[i] != ' ' && arr[i] != '<')
				stack.push(arr[i]);

			// 띄어쓰기오면 or 마지막글자에서 stack하나씩 꺼내서 sb에 넣음
			if (arr[i] == ' ' || i == arr.length - 1) {
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(" ");
			}

			// <오면 stack에 들어있는거 다 sb에 넣고, > 올때까지 sb에 넣음 !!i++해주는거 중요!!
			if (arr[i] == '<') {
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				for (int j = i; arr[j] != '>'; j++) {
					sb.append(arr[j]);
					i++;
				}
				sb.append('>');
			}
		}
		System.out.print(sb);
	}
}
