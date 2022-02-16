package BaekJoon;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_1427_소트인사이드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (a > 0) {//arrayList에 값을 하나씩 넣어줌
			arr.add(a % 10);
			a /= 10;
		}
		Collections.sort(arr, Collections.reverseOrder());//내림차순 정렬
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i));//하나씩 출력
		}
	}
}
