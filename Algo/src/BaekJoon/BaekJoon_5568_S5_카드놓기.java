package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//22.03.15
//nPr중에서 다른 수
//나는 수 뽑은걸 string으로 더하고 array에 넣은 후 for문을 통해서
//다른것들을 cnt했는데
//set을 이용하면 편하게 할 수 있다.
public class BaekJoon_5568_S5_카드놓기 {
	static int a;
	static int cnt;
	static int[] num;
	static boolean[] visit;
	static int[] result;
	static String result_string = "";
	static List<String> answer = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		cnt = sc.nextInt();
		num = new int[a];
		visit = new boolean[a];
		result = new int[a];
		for (int i = 0; i < a; i++) {
			num[i] = sc.nextInt();
		}
		recur(0);
		int cnt=0;
		for(int i=0; i<answer.size(); i++) {
			int flag=1;
			for(int j=i+1; j<answer.size(); j++) {
				if(answer.get(i).equals(answer.get(j)))
					flag=0;
			}
			if(flag==1)
				cnt++;
		}
		System.out.println(cnt);
	}

	public static void recur(int dept) {
		// 이제 그만
		if (dept >= cnt) {
			for(int i=0; i<cnt; i++) {
				result_string += result[i]+"";
			}
			answer.add(result_string);
			result_string = "";
			return;
		}

		// 재귀
		// visit을 이용해서 for문을 돌면서 방문했으면 지나가고 안했으면 방문해!
		for (int i = 0; i < a; i++) {
			if (visit[i])// 방문했으면
				continue;
			else {
				// 방문 안했으면
				// 방문한거 표시하고 result 닮고 recur돌고 방문표시 지우고
				visit[i] = true;
				result[dept] = num[i];
				recur(dept + 1);
				visit[i] = false;
			}
		}
	}
}
