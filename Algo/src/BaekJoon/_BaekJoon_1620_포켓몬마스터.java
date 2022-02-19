package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _BaekJoon_1620_포켓몬마스터 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<String> pocket = new ArrayList<String>();
		for (int i= 0; i < N; i++) {
			pocket.add(br.readLine()); 
		}
		
		for (int i = 0; i < M; i++) {
			String quiz = br.readLine();
			// 문자열
			if ((int) quiz.charAt(0) > 64) {
				System.out.println(pocket.indexOf(quiz)+1); 
				}
			// 숫자열
			else {
				int sum = Integer.parseInt(quiz); 
				System.out.println(pocket.get(sum-1));
			}
		}
	}
}
