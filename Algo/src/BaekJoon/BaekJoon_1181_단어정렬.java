package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_1181_단어정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List<String> arr = new ArrayList<String>();
		List<Integer> arr_len = new ArrayList<Integer>();
		List<String> arr_new = new ArrayList<String>();
		for (int i = 0; i < a; i++) {
			String s = sc.next();
			arr.add(s);
			arr_len.add(s.length());
		}
		Collections.sort(arr);
		Collections.sort(arr_len);

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (arr.get(j).length() == arr_len.get(i)) {
					arr_new.add(arr.get(j));
					arr.remove(j);
					break;
				}

			}
		}
		for (int i = a - 1; i > 0; i--) {
			if (arr_new.get(i).equals(arr_new.get(i - 1))) {
				arr_new.remove(i);
			}

		}
		for (int i = 0; i < arr_new.size(); i++) {
			System.out.println(arr_new.get(i));
		}
	}
}
