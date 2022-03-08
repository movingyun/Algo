package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
//22.03.08
public class BaekJoon_10867_S5_중복빼고정렬하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		Object[] arr = new Object[a];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		for (int i = 0; i < a; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
		//set사용할때
		Set<Integer> set_arr = new HashSet<Integer>();
		for (int i = 0; i < a; i++) {
			set_arr.add(Integer.parseInt(st.nextToken()));
		}
//		Arrays.sort(arr);
//		StringBuilder sb = new StringBuilder();
//		sb.append(arr[0]+" ");
//		for(int i=1; i<a; i++) {
//			if(arr[i-1]!=arr[i])
//				sb.append(arr[i]+" ");
//		}
//		System.out.println(sb);
		
		
//		set쓰는 함수 써보고싶다!!!

		TreeSet<Integer> myTreeSet = new TreeSet();
		myTreeSet.addAll(set_arr);
		arr = myTreeSet.toArray();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
