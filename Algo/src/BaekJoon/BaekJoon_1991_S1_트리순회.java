package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_1991_S1_트리순회 {
	// Node 클래스 선언
	static class Node {
		int left;
		int right;

		public Node(int left, int right) {
			this.left = left;
			this.right = right;
		}
	}

	// 배열 안에 들어갈 list
	static List<Node>[] list;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());

		// list를 값으로 갖는 array 생성
		list = new ArrayList[n + 1];
		for (int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 1; i <= n; i++) {
			String line = br.readLine();
			// A를 1 / B는 2로 바꿔줘야댐
			int data = line.charAt(0) - 'A' + 1;
			int left = line.charAt(2) - 'A' + 1;
			int right = line.charAt(4) - 'A' + 1;
			list[data].add(new Node(left, right));
		}

		preorder(1);
		sb.append("\n");
		inorder(1);
		sb.append("\n");
		postorder(1);
		System.out.println(sb.toString());

	}

	// 전위 순회
	static void preorder(int start) {
		for (Node node : list[start]) {
			int l = node.left;
			int r = node.right;

			sb.append((char) (start + 'A' - 1)); // V
			// . -'A' +1 하면 -18임 (null = -18)
			if (l != '.' - 'A' + 1)
				preorder(l); // L
			if (r != -18)
				preorder(r); // R
		}
	}

	// 중위 순회
	static void inorder(int start) {
		for (Node node : list[start]) {
			int l = node.left;
			int r = node.right;

			if (l != -18)
				inorder(l); // L
			sb.append((char) (start + 'A' - 1)); // V
			if (r != -18)
				inorder(r); // R
		}
	}

	// 후위 순회
	static void postorder(int start) {
		for (Node node : list[start]) {
			int l = node.left;
			int r = node.right;

			if (l != -18)
				postorder(l); // L
			if (r != -18)
				postorder(r); // R
			sb.append((char) (start + 'A' - 1)); // V
		}
	}
}