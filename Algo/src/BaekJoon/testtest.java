package BaekJoon;

import java.util.Scanner;

public class testtest { //  하드코딩
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[6];
		
		int maxR = 0;
		int maxC = 0;
		int maxRi = 0;
		int maxCi = 0;
		int minR = 0;
		int minC = 0;

		for (int i = 0; i < 6; i++) {
			sc.nextInt();
			arr[i] = sc.nextInt();
			if(i % 2 == 0) {
				if(arr[i] > maxR) {
					maxR = arr[i];
					maxRi = i;
				}
			}
			else {
				if(arr[i] > maxC) {
					maxC = arr[i];
					maxCi = i;
				}
			}
		}

		if((maxRi == 0 && maxCi == 1) || (maxRi == 1 && maxCi == 0)) { // 0,1
			minC = arr[3];
			minR = arr[4];
		} else if((maxRi == 1 && maxCi == 2) || (maxRi == 2 && maxCi == 1)) { // 1,2
			minC = arr[4];
			minR = arr[5];
		} else if((maxRi == 2 && maxCi == 3) || (maxRi == 3 && maxCi == 2)) { // 2,3
			minC = arr[5];
			minR = arr[0];
		} else if((maxRi == 3 && maxCi == 4) || (maxRi == 4 && maxCi == 3)) { // 3,4
			minC = arr[0];
			minR = arr[1];
		} else if((maxRi == 4 && maxCi == 5) || (maxRi == 5 && maxCi == 4)) { // 4,5
			minC = arr[1];
			minR = arr[2];
		}
				
				
		//System.out.printf("maxR : %d, maxRi : %d, maxC : %d, maxCi : %d, minR : %d, minC : %d\n", maxR, maxRi, maxC, maxCi, minR, minC);
	

		System.out.println((maxR * maxC - minR * minC) * cnt);
		
	}
}