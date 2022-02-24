package SWEA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_1225_암호생성기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			StringBuilder sb = new StringBuilder();
			Queue<Integer> arr = new LinkedList<>();
			sc.next();
			for (int i = 0; i < 8; i++) {
				arr.add(sc.nextInt());
			}
			sb.append("#" + tc);
			for (int i = 1;; i++) {
				if (i > 5)
					i -= 5;
				if (arr.peek() - i > 0) {
					arr.add((arr.poll()-i));
				}
				else {
					arr.poll();
					arr.add(0);
					for (int j = 0; j < 8; j++)
						sb.append(" " + arr.poll());
					break;
				}
			}
			System.out.println(sb);
		}		
	}
}
