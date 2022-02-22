package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2164_카드2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Queue<Integer> arr = new LinkedList<Integer>();
		for(int i=1; i<=a; i++) {
			arr.add(i);
		}
		while(arr.size()!=1) {
			arr.remove();
			arr.add(arr.peek());
			arr.remove();
		}
		System.out.println(arr.peek());
	}
}
