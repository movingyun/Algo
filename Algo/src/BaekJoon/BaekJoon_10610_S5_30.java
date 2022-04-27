package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//30의 배수 중 가장 큰 것 찾기
public class BaekJoon_10610_S5_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int flag = 0;
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<a.length(); i++) {
			list.add(a.charAt(i)-'0');
			sum+=a.charAt(i)-'0';
			if(a.charAt(i)-'0'==0) {
				flag=1;
			}
		}
		if(sum%3==0&&flag==1) {
			Collections.sort(list,Collections.reverseOrder());
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i));
			}
		}
		else System.out.println(-1);
	}
}
