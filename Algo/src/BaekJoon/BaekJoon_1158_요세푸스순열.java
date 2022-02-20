package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//22-02-18
//22-02-19 해결!!
public class BaekJoon_1158_요세푸스순열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=1; i<=a; i++) {
			arr.add(i);
		}
		int num = b;
		System.out.printf("<");
		for(int i=1; i<=a; i++) {
			System.out.print(arr.get(num-1));
			if(i==a)
				break;
			arr.remove(num-1);
			num--;
			num+=b;
			while(num>arr.size())
				num-=arr.size();
			System.out.print(", ");
		}
		System.out.printf(">");
	}
}
