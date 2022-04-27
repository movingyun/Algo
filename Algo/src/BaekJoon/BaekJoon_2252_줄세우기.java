package BaekJoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2252_줄세우기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int V = sc.nextInt();
		List<Integer>[] list = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		int cnt[] = new int[N+1];
		for(int i=0; i<V; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			list[st].add(ed);
			cnt[ed]++;
		}
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1; i<N+1; i++) {
			if(cnt[i]==0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr+" ");
			for(int i=0; i<list[curr].size(); i++) {
				cnt[list[curr].get(i)]--;
				if(cnt[list[curr].get(i)]==0)
					q.add(list[curr].get(i));
			}
		}
	}
}
