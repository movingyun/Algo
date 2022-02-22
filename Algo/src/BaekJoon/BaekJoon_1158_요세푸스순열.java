package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

//22-02-18
//22-02-19 해결!!
public class BaekJoon_1158_요세푸스순열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= a; i++) {
			arr.add(i);
		}
		int num = b;
		System.out.printf("<");
		for (int i = 1; i <= a; i++) {
			System.out.print(arr.get(num - 1));
			if (i == a)
				break;
			arr.remove(num - 1);
			num--;
			num += b;
			while (num > arr.size())
				num -= arr.size();
			System.out.print(", ");
		}
		System.out.printf(">");
	}
}

//22.02.22
//큐로 해결하기

//public class BaekJoon_1158_요세푸스순열 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		sb.append("<");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		Queue<Integer> arr = new LinkedList<Integer>();
//		for(int i=1; i<=a; i++) {
//			arr.add(i);
//		}
//		while(!arr.isEmpty()) {
//			for(int i=1; i<b; i++) {
//				arr.add(arr.remove());	
//			}
//			sb.append(arr.remove()+", ");
//		}
//		sb.deleteCharAt(sb.length()-1);
//		sb.deleteCharAt(sb.length()-1);
//		sb.append(">");
//		for(int i=0;i<sb.length(); i++) {
//			System.out.print(sb.charAt(i));
//		}
//	}
//}

