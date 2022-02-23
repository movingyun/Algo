package SWEA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SWEA_4047_영준이의카드카운팅 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();


	out : for(int tc=1; tc<=T; tc++) {
		StringBuilder sb = new StringBuilder();
		int s =13;
		int d =13;
		int h =13;
		int c =13;
		
		String a = sc.next();
		List<String> arr = new ArrayList<String>();
		
		for(int i=0; i<a.length(); i+=3) {
			arr.add(a.substring(i, i+3));
		}
		sb.append("#"+tc+" ");
		Collections.sort(arr);
		for(int i=0; i<arr.size(); i++) {
			if(i<arr.size()-1&&arr.get(i).equals(arr.get(i+1))) {
				sb.append("ERROR");
				System.out.println(sb);
				continue out;
			}
			if(arr.get(i).charAt(0)=='S')
				s--;
			if(arr.get(i).charAt(0)=='D')
				d--;
			if(arr.get(i).charAt(0)=='H')
				h--;
			if(arr.get(i).charAt(0)=='C')
				c--;
		}
		sb.append(s+" "+ d +" "+ h +" "+c);
		System.out.println(sb);
	}
}
}
