package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon_2751_수정렬2 { //리스트 + 콜렉션.sort + StringBuilder

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list); // 오름차순으로 정렬

		for(int e : list) { //for each문 사용. 
			sb.append(e).append("\n"); //ArrayList 각 요소 하나하나 StringBuilder 객체 sb에 담고 개행처리
		}
		System.out.println(sb); //sb에 담은 문자열 모두 출력
	}
}

