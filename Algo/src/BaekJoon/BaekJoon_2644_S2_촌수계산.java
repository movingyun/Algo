package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2644_S2_촌수계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nodeCnt = sc.nextInt();
		int node1 = sc.nextInt();
		int node2 = sc.nextInt();
		int v = sc.nextInt();
		int[][] map = new int[v][2];
		int[] visit = new int[nodeCnt + 1];

		for (int i = 0; i < v; i++) {
			map[i][0] = sc.nextInt();
			map[i][1] = sc.nextInt();
		}

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(node1);
		visit[node1] = 1;
		int ansDist = 0;
		int flag = 0;
		
		//q가 차있으면 돌림
		outer : while (!q.isEmpty()) {
			//사이즈 재고
			int size = q.size();
			//바로 사이즈만큼 돌리기
			for (int i = 0; i < size; i++) {
				int curr = q.poll();
				//찾으면 나가!
				if(curr==node2) {
					flag=1;
					break outer;
				}
				//못찾았으면 인접한거 체크해서 큐에 넣어
				for (int j = 0; j < v; j++) {
					if (map[j][0] == curr || map[j][1] == curr) {
						if (visit[map[j][0]] == 0) {
							q.add(map[j][0]);
							visit[map[j][0]]++;
						}
						if (visit[map[j][1]] == 0) {
							q.add(map[j][1]);
							visit[map[j][1]]++;								
						}
					}
				}
			}
			ansDist++;
		}
		if(flag==0) ansDist =-1;
		System.out.println(ansDist);
	}
}
