package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1065_S4_한수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int cnt = 0;
		outer : for(int i=1; i<=Integer.parseInt(a); i++) {
			if(i<10) {
				cnt++;
				continue;
			}
			char[] c = Integer.toString(i).toCharArray();
			int before = c[1] - c[0];
			for(int j=1; j<c.length-1; j++) {
				int num = c[j+1] - c[j]; 
				if(before != num) {
					continue outer;
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
