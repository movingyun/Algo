package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_4948_베르트랑공준 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[246913];

		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; j * i < arr.length; j++) {
				if (arr[j * i] == 0) {
					arr[j * i]++;
				}

			}
		}
		for(;;) {
			int total = 0;
			int n = Integer.parseInt(br.readLine());
			if(n==0)
				break;
			else
			{
				for(int i=n+1; i<=2*n; i++) {
					if(arr[i]==1) {
						total++;
					}
						
				}
				System.out.println(n-total);
			}
			
		}
		

	}
}
