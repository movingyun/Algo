package Programmers;

import java.util.Arrays;

//정렬해서 예산이 넘기전까지 cnt
public class Programmers_lv1_예산 {
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		System.out.println(solution(d,budget)); 
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0;
		Arrays.sort(d);
		for(int i=0; i<d.length; i++) {
			sum+=d[i];
			if(sum>budget) break;
			answer++;
		}
		return answer;
	}
}
