package SWEA;

import java.util.Scanner;

public class SWEA_5650_핀볼게임 {

	static int N, max, cnt, nr, nc, nSitu, str, stc, flag;
	static int[][] map;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};

	static class ball {
		// situ : 상하좌우
		int row, col, situ;

		public ball(int row, int col, int situ) {
			this.row = row;
			this.col = col;
			this.situ = situ;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			map = new int[N][N];
			max = -1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			// 0인곳에 공을두고 게임을 시작해보자
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 0) {
						str = i;
						stc = j;
						game(new ball(str, stc, 1));
						game(new ball(str, stc, 2));
						game(new ball(str, stc, 3));
						game(new ball(str, stc, 4));
					}
				}
			}
			System.out.println("#"+tc+" "+max);
		} // tc
	}// main

	// 게임시작
	public static void game(ball ball) {
		// ㄱㄱ
		cnt = 0;
		nr = ball.row ;
		nc = ball.col;
		nSitu = ball.situ;
		
		while(true) {
			//가자
			
			nr += dr[nSitu-1];
			nc += dc[nSitu-1];
			check(nr, nc);
			//랙홀이나 시작자리로 돌아오면 끝내
			if((nr>=0&&nr<N&&nc>=0&&nc<N)&&(map[nr][nc]==-1 || (nr==str&&nc==stc))) {
				if(cnt>max) max = cnt;
				break;
			}
			
		}
	}// game함수

	public static void check(int r, int c) {
		// 범위 벗어나거나 5만나면 cnt++하고 반대방향으로
		if (r == -1 || r == N || c == -1 || c == N || map[r][c] == 5) {
			cnt++;
			if (nSitu % 2 == 0)
				nSitu--;
			else
				nSitu++;
			return;
		}

		// 그냥 0이면 return
		if (map[r][c] == 0)
			return;

		// 1~4만나면 방향고려해서 틀어
		if (map[r][c] >= 1 && map[r][c] <= 4) {
			cnt++;
			//1을 만났을때
			if(map[r][c] == 1) {
				if(nSitu==1) nSitu = 2;
				else if(nSitu==2) nSitu = 4;
				else if(nSitu==3) nSitu = 1;
				else if(nSitu==4) nSitu = 3;
				return;
			}
			
			//2을 만났을때
			if(map[r][c] == 2) {
				if(nSitu==1) nSitu = 4;
				else if(nSitu==2) nSitu = 1;
				else if(nSitu==3) nSitu = 2;
				else if(nSitu==4) nSitu = 3;
				return;
			}
			
			//3을 만났을때
			if(map[r][c] == 3) {
				if(nSitu==1) nSitu = 3;
				else if(nSitu==2) nSitu = 1;
				else if(nSitu==3) nSitu = 4;
				else if(nSitu==4) nSitu = 2;
				return;
			}
			
			//4을 만났을때
			if(map[r][c] == 4) {
				if(nSitu==1) nSitu = 2;
				else if(nSitu==2) nSitu = 3;
				else if(nSitu==3) nSitu = 4;
				else if(nSitu==4) nSitu = 1;
				return;
			}
		}

		// 6~10이면 다른 웜홀로 나와
		if (map[r][c] >= 6 && map[r][c] <= 10) {
			//지금 웜홀 번호
			int curr = map[r][c];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(map[i][j]==curr&&(r!=i||c!=j)) {
						nr = i;
						nc = j;
					}
				}
			}
			return;
		}
	}
}
