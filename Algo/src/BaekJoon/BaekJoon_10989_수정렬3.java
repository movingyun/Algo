package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10989_수정렬3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];
		int[] arr_count = new int[10001];
		int[] arr_new = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arr_count[arr[i]]++;
		}
		
		for(int i=1; i<10001; i++) {
			arr_count[i]+=arr_count[i-1];
		}
		
		for(int i=a-1; i>=0; i--) {
			arr_new[--arr_count[arr[i]]] = arr[i];
		}
		
		for (int i = 0; i < a; i++) {
			System.out.println(arr_new[i]);
		}
	}
}


