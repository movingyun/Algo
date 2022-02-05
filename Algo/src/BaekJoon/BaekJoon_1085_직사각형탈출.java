package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1085_직사각형탈출 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	
	int x = Integer.parseInt(st.nextToken());
	int y = Integer.parseInt(st.nextToken());
	int w = Integer.parseInt(st.nextToken());
	int h = Integer.parseInt(st.nextToken());
	
	int[] arr = {x,y,h-y,w-x};
	Arrays.sort(arr);
	System.out.println(arr[0]);
}
}
