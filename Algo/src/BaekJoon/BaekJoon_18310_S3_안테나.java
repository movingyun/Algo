package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

//22.03.10
//그냥 가운데 있는거 뽑으면 된다. 짝수면 앞에꺼
public class BaekJoon_18310_S3_안테나 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[((a+1)/2)-1]);
	}
}
