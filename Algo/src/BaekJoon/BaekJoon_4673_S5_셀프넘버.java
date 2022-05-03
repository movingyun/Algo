package BaekJoon;

public class BaekJoon_4673_S5_셀프넘버 {
	public static void main(String[] args) {
		int[] num = new int[10001];
		for (int i = 1; i < 10001; i++) {
			num[i] = i;
		}

		for (int i = 1; i < 10001; i++) {
			int sum = i;
			int numCopy = i;
			while (true) {
				sum += numCopy % 10;
				numCopy /= 10;
				if (numCopy == 0)
					break;
			}
			sum += numCopy;
			if (sum < 10001)
				num[sum] = -1;
		}
		for (int i = 1; i < 10001; i++) {
			if (num[i] != -1)
				System.out.println(num[i]);
		}
	}
}
