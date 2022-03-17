package Programmers;

//22.03.16
//제곱수는 약수가 홀수니까 빼준다.
public class Programmers_lv1_약수의개수와덧셈 {
	public static void main(String[] args) {
		System.out.println(solution(13,17));
	}

	public static int solution(int left, int right) {
		int answer = 0;
		for (int i = (int) Math.ceil(Math.sqrt(left)); i <= (int) Math.floor(Math.sqrt(right)); i++) {
			answer -= 2 * (Math.pow(i, 2));
		}
		for (int i = left; i <= right; i++) {
			answer += i;
		}
		return answer;
	}
}
