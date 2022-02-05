package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10250_ACM호텔 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		
		for(int i =0; i<a; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			
			int fl = t % h;
			int ho = t / h + 1;
			if (fl == 0) {
					System.out.println(h * 100 + ho - 1);
			}
			else System.out.println(fl * 100 + ho);
		}

	}
}
