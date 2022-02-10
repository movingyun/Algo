package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2798_블랙잭 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	

	int[] arr = new int[N];
	for(int i=0; i<N; i++) {
		arr[i] = sc.nextInt();
	}
	int max=0;
	int sum=0;
	for(int j=0; j<N; j++) {
		for(int q=0; q<N; q++) {
			if(j==q)
				continue;
			for(int k=0; k<N; k++) {
				if(k==q || k==j)
					continue;
				if((arr[j]+arr[q]+arr[k])<=M)
					sum+=(arr[j]+arr[q]+arr[k]);
				if(sum>max)
					max=sum;
				sum=0;
			}
		}
	}
	System.out.println(max);
}
}
