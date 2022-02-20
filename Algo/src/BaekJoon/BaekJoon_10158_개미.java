package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
// 22.02.18 : 델타를 이용해서 벽에 부딪치면 -1을 곱해줘서 방향을 틀어준다.(시간초과)
// 22.02.19 : H*W시간이면 제자리로 돌아오는것을 알고 t를 줄여준다.(시간초과)
// 22.02.20 : 갈아엎어야지..... x랑 y랑 따로 구한다. x는 2w마다 제자리, y는 2h마다 제자리
public class BaekJoon_10158_개미 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		int b = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		int t = Integer.parseInt(st.nextToken());
		
		int tx = t%(2*w);
		int ty = t%(2*h);
		int dr = 1;
		int dc = 1;
		for (int i = 1; i <= tx; i++) {
			b = b + dr;
			if (b == w || b == 0)
				dr *= -1;
		}
		
		for (int i = 1; i <= ty; i++) {
			a = a + dc;
			if (a == h || a == 0)
				dc *= -1;
		}
		
		
		System.out.printf("%d %d", b, a);
	}
}
