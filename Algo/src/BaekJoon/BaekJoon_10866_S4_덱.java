package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BaekJoon_10866_S4_덱 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		Deque<Integer> q = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch (s) {
			case "push_front":
				int num = Integer.parseInt(st.nextToken());
				q.addFirst(num);
				break;
			case "push_back":
				num = Integer.parseInt(st.nextToken());
				q.addLast(num);
				break;

			case "pop_front":
				if (q.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(q.pollFirst() + "\n");
				break;

			case "pop_back":
				if (q.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(q.pollLast() + "\n");
				break;

			case "size":
				sb.append(q.size() + "\n");
				break;

			case "empty":
				if (q.isEmpty())
					sb.append(1 + "\n");
				else
					sb.append(0 + "\n");
				break;

			case "front":
				if (q.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(q.peekFirst() + "\n");
				break;
			case "back":
				if (q.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(q.peekLast() + "\n");
				break;
			}
		}
		System.out.println(sb);
	}
}
