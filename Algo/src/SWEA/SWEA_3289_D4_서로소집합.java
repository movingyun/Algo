package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3289_D4_서로소집합 {
	
	static int[] p;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();
			sb.append("#"+tc+" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			p = new int[N+1];
			
			makeSet();
			
			for(int i=0; i<M; i++) {
				st = new StringTokenizer(br.readLine());
				int fun = Integer.parseInt(st.nextToken());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if(fun==0) union(a,b);
				else{
					if(findSet(a)==findSet(b)) sb.append(1);
					else sb.append(0);
				}
			}
			System.out.println(sb);
		}//tc함수
	}// main 함수
	
	public static void makeSet() {
		for(int i=1; i<=N; i++) {
			p[i]=i;
		}
	}
	
	public static int findSet(int x) {
		if(p[x]==x) return x;
		else return p[x] = findSet(p[x]);
	}
	
	public static void union(int x, int y) {
		int px = findSet(x);
		int py = findSet(y);
		if(px==py) return;
		p[py] = px;
	}
}
