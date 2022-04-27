package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 인접리스트 사용해서 풀었음...
// 생각하기 너무 귀찮다...
public class BaekJoon_10814_S5_나이순정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List<String>[] arr = new ArrayList[201];
		for (int i = 0; i < 201; i++) {
			arr[i] = new ArrayList<String>();
		}
		for (int i = 0; i < a; i++) {
			int idx = sc.nextInt();
			String name = sc.next();
			arr[idx].add(name);
		}
		for (int i = 0; i < 201; i++) {
			for (int j = 0; j < arr[i].size(); j++) {
				System.out.println(i + " " + arr[i].get(j));
			}
		}
	}
}
