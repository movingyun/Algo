package BaekJoon;

import java.util.Scanner;

public class BaekJoon_15596_정수n개합 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		
		int a = sc.nextInt();
		int[] b = new int[a];
		
		for(int i =0; i<a; i++) {
			b[i]=sc.nextInt();
		}
		
		System.out.println(t.sum(b));
	}
}
	
	
	
	class Test {
	    long sum(int[] a) {
	        long ans = 0;
	        
	        for (int i : a) {
				ans += i;
			}
	        
	        return ans;
	    }
	}
	