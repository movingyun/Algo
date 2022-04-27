package BaekJoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_10026_G5_적록색약 {
	
	static char[][] arr1;
	static char[][] arr2;
	static int a;
	static int[][] visit;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	static int result;
	
	public static class pos{
		int r;
		int c;
		
		public pos(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		arr1 = new char[a][a];
		arr2 = new char[a][a];
		visit = new int[a][a];
		
		//일반 사람
		for(int i=0; i<a; i++) {
			String s = sc.next();
			arr1[i] = s.toCharArray();
			arr2[i] = s.toCharArray();
			for(int j=0; j<a; j++) {
				if(arr2[i][j]=='R'||arr2[i][j]=='G') {
					arr2[i][j]='M';
				}
			}
		}
		//-------------------------------array만들기 끝!
		
		//구역찾기
		
		result = 0;
		findSec(arr1);
		StringBuilder sb = new StringBuilder();
		sb.append(result+" ");
		result = 0;
		visit = new int[a][a];
		findSec(arr2);
		sb.append(result);
		System.out.println(sb);
	}//main함수 끝
	
	
	public static void findSec(char[][] arr) {
		Queue<pos> q = new LinkedList<pos>();
		int cnt = 0;
		//q비면 구간 나누고 다시 처음꺼 넣는다.
		while(cnt!=a*a) {
			outer : for(int w = 0; w<a; w++) {
				for(int k=0; k<a; k++) {
					if(visit[w][k]==0) {
						pos pos = new pos(w,k);
//						System.out.printf("nr : %d nc : %d\n",w,k);
						q.add(pos);
						visit[w][k] = 1;
						cnt++;
						break outer;
					}
				}
			}
			
			while(!q.isEmpty()) {
				pos curr = q.poll();
				
				//돌면서 자식들 큐에 넣음
				for(int i=0; i<4; i++) {
					int nr = curr.r + dr[i];
					int nc = curr.c + dc[i];
					
					//nr,nc검사
					if(nr<0||nr>=a||nc<0||nc>=a) continue;
					if(visit[nr][nc]==1) continue;
					
					if(arr[curr.r][curr.c]==arr[nr][nc]) {
//						System.out.printf("nr : %d nc : %d\n",nr,nc);
						q.add(new pos(nr,nc));
						visit[nr][nc]=1;
						cnt++;
					}
				}//자식 넣기for문
			}//q 빌때까지 while문
//			System.out.println("------------------------");
			result++;	
		}//구간 돌리기
	}
}
