package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_5430_G5_AC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		outer: for (int tc = 1; tc <= T; tc++) {
			String s1 = sc.next();
			int a = sc.nextInt();
			String s2 = sc.next();
			if (a==0&&s1.contains("D")) {
				System.out.println("error");
				continue;
			}
			s2 = s2.replace("[", "");
			s2 = s2.replace("]", "");
			String[] sArray = s2.split(",");
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < sArray.length; i++) {
				list.add(sArray[i]);
			}
			int flag = 0;
			int flag2 = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == 'R') {
					flag = flag * -1 + 1;
					flag2 = flag2 * -1 + 1;
				} else {
					if (list.isEmpty()) {
						System.out.println("error");
						continue outer;
					}
					if (flag == 0) {
						list.remove(0);
					} else {
						list.remove(list.size() - 1);
					}
				}
			}
			if (flag2 == 0) {
				StringBuilder sb = new StringBuilder();
				sb.append("[");
				for (int i = 0; i < list.size(); i++) {
					sb.append(list.get(i));
					if (i != list.size()-1) {
						sb.append(",");
					}
				}
				sb.append("]");
				System.out.println(sb);
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append("[");
				for (int i = list.size() - 1; i >= 0; i--) {
					sb.append(list.get(i));
					if (i != 0) {
						sb.append(",");
					}
				}
				sb.append("]");
				System.out.println(sb);
			}
		}
	}
}
