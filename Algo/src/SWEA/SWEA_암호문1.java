package SWEA;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SWEA_암호문1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int a = sc.nextInt();
			List<Integer> arr = new LinkedList<Integer>();
			for (int i = 0; i < a; i++) {
				arr.add(sc.nextInt());
			}
			int b = sc.nextInt(); // 명령어 수
			for (int i = 0; i < b; i++) {
				sc.next();
				int loc = sc.nextInt();
				int num = sc.nextInt();
				for (int j = 0; j < num; j++) {
					arr.add(loc + j, sc.nextInt());
//				System.out.println("들어감");
				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < 10; i++) {
				System.out.print(arr.get(i) + " ");
			}
			System.out.println();
		}

	}
}
