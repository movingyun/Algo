package Programmers;

public class Programmers_lv1_키패드누르기 {
	public static void main(String[] args) {
		int[] numbers = { 7, 0, 8 };
		System.out.println(solution(numbers, "right"));
	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int left_num = 10;
		int right_num = 12;

		for (int i = 0; i < numbers.length; i++) {
			int des_left = 0;
			int des_right = 0;
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				left_num = numbers[i];
			}

			else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				right_num = numbers[i];
			}

			else {
				if (numbers[i] == 0)
					numbers[i] += 11;
				des_left = Math.abs((left_num - 1) / 3 - (numbers[i] - 1) / 3)	+ Math.abs((left_num - 1) % 3 - (numbers[i] - 1) % 3);
				des_right = Math.abs((right_num - 1) / 3 - (numbers[i] - 1) / 3) + Math.abs((right_num - 1) % 3 - (numbers[i] - 1) % 3);
				if (des_left < des_right) {
					answer += "L";
					left_num = numbers[i];
				}

				if (des_left > des_right) {
					answer += "R";
					right_num = numbers[i];
				}
				if (des_left == des_right) {
					if (hand.equals("right")) {
						answer += "R";
						right_num = numbers[i];
					} else {
						answer += "L";
						left_num = numbers[i];
					}
				}
			}
		}
		return answer;
	}
}
