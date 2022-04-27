package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1231_D4_중위순회 {
	static char[] arr;
	static int size;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			size = sc.nextInt();
			sc.nextLine();
			arr = new char[size + 1];

			for (int i = 1; i <= size; i++) {
				sc.nextInt(); //숫자버림
				arr[i] = sc.nextLine().charAt(1);
			}
			System.out.print("#" + tc + " ");
			inorder(1);
			System.out.println();
		}
	}// 메인함수

	public static void inorder(int idx) {
		if (idx > size)
			return;
		inorder(2 * idx);
		System.out.print(arr[idx]);
		inorder(2 * idx + 1);
	}
}
