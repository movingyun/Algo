package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//22.02.23 : e가 너무 커지면 연산이 너무 많아진다...
// 에르테네스의 채 사용해서 해결
// 34번 line 조건을 앞뒤로 바꿔주니까 속도 올라감.
public class SWEA_4698_테네스의특별한소수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[1000001];
		arr[0] = 1;
		arr[1] = 1;

		for (int j = 2; j < 1000000; j++) {
			if(j>2&&j%2==0)
				continue;
			for (int i = 2; j * i <= 1000000; i++) {
				if (arr[i * j] == 0) {
					arr[i * j]++;
				}
			}
		}
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()+" ");
			int D = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int sum = 0;
			for (int i = s; i <= e; i++) {
				if (arr[i]==0&&(i+"").contains(D +"")) {
					sum++;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
