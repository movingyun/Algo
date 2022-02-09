package BaekJoon;
import java.util.*;
import java.io.*;

public class BaekJoon_1002_터렛 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		int n;					
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i<n; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			sb.append(get_targetp(x1, y1, r1, x2, y2, r2)).append('\n');
		}
		System.out.println(sb);
	}
	
	public static int get_targetp(int x1, int y1, int r1, int x2, int y2, int r2)
	{
		int dis = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));		
		
		if (x1 == x2 && y1 == y2 && r1 == r2)
		{
			//무한대일 때 - 중점과 반지름이 같을 때
			return -1;
		}
		else if (dis > Math.pow(r1+r2, 2))
		{
			// 없을 때 - 두 원의 반지름 합보다 중점간 거리가 더 길 때
			return 0;
		}
		else if(dis < Math.pow(r2-r1, 2))
		{
			// 없을 때 - 원 안에 원이 있으나 내접하지 않을 때
			return 0;
		}
		else if(dis == Math.pow(r2-r1, 2))
		{
			// 1개일 때 - 내접할 때
			return 1;
		}
		else if(dis == Math.pow(r2+r1, 2))
		{
			// 1개일 때 - 외접할 때
			return 1;
		}
		else
		{
			// 2개일 때
			return 2;
		}
	}

}
