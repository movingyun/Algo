package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1966_S3_프린터큐 {

	static class result implements Comparable<result> {
		int score, ju;

		public result(int score, int ju) {
			this.score = score;
			this.ju = ju;
		}

		@Override
		public int compareTo(result o) {
			// TODO Auto-generated method stub
			return o.score-this.score;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int idx = 0;
			List<result> list = new ArrayList<result>();
			List<result> listCol = new ArrayList<result>();
			int is = 0;
			for(int j=0; j<a; j++) {
				int q = sc.nextInt();
				if(j==b)
					is = 1;
				else is = 0;
				list.add(new result(q,is));
				listCol.add(new result(q, is));
			}
			int pick = 0;
			while(true) {
				Collections.sort(listCol);
				if(list.get(0).score==listCol.get(0).score) {
					pick++;
					if(list.get(0).ju==1)
						break;
					list.remove(0);
					listCol.remove(0);
				}
				else {
					int num = list.get(0).score;
					int is2 = list.get(0).ju;
					list.remove(0);
					list.add(new result(num,is2));
				}
			}
			System.out.println(pick);
		}//for
	}
}
