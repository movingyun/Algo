package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
//22.02.22 메모리초과...
public class _BaekJoon_11025_요세푸스문제3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= a; i++) {
			arr.add(i);
		}
		int num = b;
		int cnt =0;
		for (int i = 1; i <= a; i++) {
			if(cnt==a-1)
			System.out.print(arr.get(num - 1));
			if (i == a)
				break;
			arr.remove(num - 1);
			num--;
			num += b;
			while (num > arr.size())
				num -= arr.size();
			cnt++;
		}
	}
}