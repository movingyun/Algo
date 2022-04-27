package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10834_벨트 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double a = 1;
		int cnt=0;
		for(int i=0; i<T; i++) {
			a = a/sc.nextInt();
			a = a*sc.nextInt();
			if(sc.nextInt()==1)
				cnt++;
		}
		if(cnt%2==0)
			cnt=0;
		else
			cnt=1;
		System.out.print(cnt +" " + (int)a);
	}
}
