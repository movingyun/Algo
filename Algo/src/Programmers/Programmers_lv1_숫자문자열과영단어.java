package Programmers;

import java.util.Scanner;

public class Programmers_lv1_숫자문자열과영단어 {
	public static void main(String[] args) {
		System.out.println(solution("nine"));

	}

	public static int solution(String s) {
		String answer = "";
		int[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] eng = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		String input = "";
		for (int i = 0; i < s.length(); i++) {
			s.charAt(i);
			if (!(s.charAt(i) > 96)) {// 숫자면 바로 answer에 더해준다.
				answer += (s.charAt(i) + "");
			}
			if (s.charAt(i) > 96) {
				// 문자면 input에 넣고 eng에 있는지 비교하고
				// 없으면 넘어가고 있으면 숫자로 바꿔서 answer에 더해준 뒤 input 초기화
				input += Character.toString(s.charAt(i));
				for (int j = 0; j < 10; j++) {
					if (eng[j].equals(input)) {
						answer += (num[j] + "");
						input = "";
						break;
					}
				}
			}
		}
		// String타입을 숫자로 바꾼다.
		int answer_num = Integer.parseInt(answer);
		return answer_num;
	}
}
