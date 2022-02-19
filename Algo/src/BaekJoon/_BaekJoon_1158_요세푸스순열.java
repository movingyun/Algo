package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//22-02-18
public class _BaekJoon_1158_요세푸스순열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=1; i<=a; i++) {
			arr.add(i);
		}
		int num = 1;
		for(int i=1; i<=a; i++) {
			System.out.println(arr.get(i*b-1));
			arr.remove(i*b-1);
		}
	}
}
