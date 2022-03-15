package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_lv1_실패율 {
	public static void main(String[] args) {
		int N = 4;
		int[] stages = { 5,5,5,4};
		System.out.println(Arrays.toString(solution(N, stages)));
	}
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int[] arr_stage = new int[N + 1]; //stage에 간사람
		int[] arr_stay = new int[N + 1]; //거기서 멈춰있는 사람
		out: for (int i = 0; i < stages.length; i++) {
			if (stages[i] <= N)
				arr_stay[stages[i]]++; //멈춰있는 사람 수 구함(N보다 크면 다 통과!)
			for (int j = 1; j <= stages[i]; j++) {
				if (j == N + 1) {//다 통과했으면...
					continue out;//그냥 나가!
				}
				arr_stage[j]++;
			}
		}
//		System.out.println(Arrays.toString(arr_stage));
//		System.out.println(Arrays.toString(arr_stay));
		double[] fail = new double[N];
		List<Double> fail_list = new ArrayList<Double>();
		for (int i = 1; i < N+1; i++) {
			if(arr_stay[i]==0) {
				fail[i-1]=0;
				fail_list.add(fail[i - 1]);
				continue;
			}
			fail[i - 1] = (double) arr_stay[i] / (double) arr_stage[i];
			fail_list.add(fail[i - 1]);
		}
		
		//내림차순으로 정렬하는 함수 기억하자!!
		Collections.sort(fail_list,Collections.reverseOrder());
		
		//index찾기!
		for (int i = 0; i < fail_list.size() ; i++) {
			for (int j = 0; j < fail.length; j++) {
				if (fail_list.get(i) == fail[j]) {
					answer[i] = j + 1;
					fail[j] = -1.0;
					break;
				}
			}
		}
		return answer;
	}
}
