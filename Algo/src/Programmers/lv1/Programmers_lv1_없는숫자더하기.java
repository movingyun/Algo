package Programmers.lv1;

public class Programmers_lv1_없는숫자더하기 {
	static int[] all;
	
	public static void main(String[] args) {
		all = new int[10];
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(solution(numbers));
	}

	public static int solution(int[] numbers) {
		int answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			all[numbers[i]] = 1;
		}
		for (int i = 0; i < 10; i++) {
			if (all[i] == 0)
				answer += i;
		}
		return answer;
	}
}
