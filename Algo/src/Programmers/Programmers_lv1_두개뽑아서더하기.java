package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Programmers_lv1_두개뽑아서더하기 {

	static Set<Integer> answer = new HashSet<Integer>();
	static List<Integer> result;

	public static void main(String[] args) {
		int[] numbers = { 0, 100, 1000, 10 };
		solution(numbers);
		System.out.println(result);
	}

	public static List<Integer> solution(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				sum = numbers[i] + numbers[j];
				answer.add(sum);
			}
		}
		result = new ArrayList<Integer>(answer);
		Collections.sort(result);
		return result;
	}
}
