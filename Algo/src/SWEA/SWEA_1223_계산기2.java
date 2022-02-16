package SWEA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SWEA_1223_계산기2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int result = 0;
			int a = sc.nextInt();
			String arr = sc.next();
			Stack<Character> arr_s = new Stack<Character>();
			int top = -1;
			List<Character> c = new ArrayList<Character>();

			for (int i = 0; i < a; i++) {
				if (arr.charAt(i) > 48) {
					c.add(arr.charAt(i));
				} else {
					if (arr_s.isEmpty()) {
						arr_s.push(arr.charAt(i));
					} else if (arr.charAt(i) == '+') {
						for (int j = 0; j < arr_s.size(); j++) {
							c.add(arr_s.pop());
						}
						arr_s.push('+');
					} else if (arr.charAt(i) == '*') {
						for (int j = 0; j < arr_s.size(); j++) {
							if (arr_s.peek() == '+') {
								arr_s.push('*');
								break;
							} else
								c.add(arr_s.pop());
						}
					}
				}
			}
			for (int i = 0; i < arr_s.size() + 1; i++) {
				c.add(arr_s.pop());
			}
//			for (int i = 0; i < c.size(); i++) {
//				System.out.print(c.get(i));
//			}
			List<Integer> num = new ArrayList<Integer>();
			int q =0;
			for(int i=0; i<c.size(); i++) {
				if(c.get(i)>48)
					num.add(c.get(i)-48);
				else if(c.get(i)=='+') {
					q = num.get(i-1)+num.get(i-2);
					num.remove(i-1);
					num.remove(i-2);
					num.add(q);
					i--;
				}
				else if(c.get(i)=='*') {
					q = num.get(i-1)*num.get(i-2);
					num.remove(i-1);
					num.remove(i-2);
					num.add(q);
					i--;
				}
			}
			for(int i=0; i<num.size(); i++) {
				num.get(i);
			}
			
//			System.out.println("#" + tc + " " + sum);
		}
	}
}
