package Programmers.lv2;

public class _124나라의숫자 {

	static int target = 50;
	static int[] arr = { 1, 2, 4 };

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int temp = 0;
		if(target==3) {
			System.out.println(4);
			return;
		}
		if(target%3==0) target -= 3;
		while (target > 0) {
			int num = target % 3;
			sb.append(num);
			target /= 3;
		}
		sb = sb.reverse();
		for (int i = 0; i < sb.length(); i++) {
			int idx = sb.charAt(i) - '0' - 1;
			if (idx == -1)
				idx = 2;
			sb2.append(arr[idx]);
		}
		System.out.println(sb2);
	}
}

