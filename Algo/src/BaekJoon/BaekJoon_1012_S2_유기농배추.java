package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1012_S2_유기농배추 {
	
	static int M,N,K,cnt;
	static int[][] map, visit;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	static class pos{
		int r,c,situ;

		public pos(int r, int c, int situ) {
			this.r = r;
			this.c = c;
			this.situ = situ;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			
			map = new int[M][N];
			visit = new int[M][N];
			
			for(int i=0; i<K; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[x][y] = 1;
			}
			cnt = 0;
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(map[i][j]==1&&visit[i][j]==0) {
						bfs(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}//tc
	}//main
	
	static void bfs(int r, int c) {
		Queue<pos> q = new LinkedList<>();
		q.add(new pos(r,c,1));
		visit[r][c] = 1;
		while(!q.isEmpty()) {
			pos curr = q.poll();
			
			for(int i=0; i<4; i++) {
				int nr = curr.r + dr[i];
				int nc = curr.c + dc[i];
				
				if(nr<0||nc<0||nr>=M||nc>=N) continue;
				if(map[nr][nc]==0||visit[nr][nc]==1) continue;
				
				q.add(new pos(nr,nc,1));
				visit[nr][nc]=1;
			}
		}
	}
}
