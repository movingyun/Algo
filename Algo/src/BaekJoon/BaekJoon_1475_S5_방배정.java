package BaekJoon;

import java.util.Scanner;

//22.03.17
//숫자를 카운팅한다. 가장 많이 나온 수 만큼 더미가 필요함
//근데 6,9이면 나눠쓸수 있으니까 sum에다가 더해주고 continue
//마지막에 max랑 (sum+1)/2 비교해서 큰걸로 결정!
public class BaekJoon_1475_S5_방배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[10];
		String num = sc.next();
		for(int i=0; i<num.length(); i++) {
			cnt[num.charAt(i)-'0']++;
		}
		int max = 0;
		int sum = 0;
		for(int i=0; i<10; i++) {
			if(i==6||i==9) {
				sum+=cnt[i];
				continue;
			}
			else if(cnt[i]>max) {
				max=cnt[i];
			}
		}
		System.out.println(Math.max(max, (sum+1)/2));
	}
}
