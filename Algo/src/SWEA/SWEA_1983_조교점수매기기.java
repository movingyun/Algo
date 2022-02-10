package SWEA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SWEA_1983_조교점수매기기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String[] score_arr = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
			int student_len = sc.nextInt();
			double student_num = sc.nextInt();
			List<Double> student_score = new ArrayList<>();
			
			for(int i=0; i<student_len; i++) {
				student_score.add((sc.nextDouble()*0.35) + (sc.nextDouble()*0.45) + (sc.nextDouble()*0.20));
				}
			double target_num = student_score.get(((int)student_num)-1);
			student_score.sort(Comparator.reverseOrder());
			int result = student_score.indexOf(target_num);
			System.out.printf("#%d %s\n",tc,score_arr[(int) Math.ceil(result/(student_len/10))]);
		}
	}
}
