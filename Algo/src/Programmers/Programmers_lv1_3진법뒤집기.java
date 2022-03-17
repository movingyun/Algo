package Programmers;

public class Programmers_lv1_3진법뒤집기 {
	public static void main(String[] args) {
		System.out.println(solution(100000000));
	}

	public static int solution(int n) {
		int answer = 0;
		String num = "";
		for (int i = n; n / 3 > 0;) {
			num += (n % 3 + "");
			n = n / 3;
		}
		num += (n + "");
//		answer = Integer.parseInt(num);
		int sum = 0;
		int idx = 0;
		for (int i = num.length()-1; i>=0; i--) {
			sum += ((num.charAt(i)-'0') * Math.pow(3, idx));
			answer = answer / 10;
			idx++;
		}
		sum += (answer * Math.pow(3, idx));
		return sum;
	}
}
