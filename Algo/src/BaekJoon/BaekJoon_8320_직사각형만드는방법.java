package BaekJoon;

import java.util.Scanner;

public class BaekJoon_8320_직사각형만드는방법 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int sum =0;
	for(int i=a; i>=1; i--) {
		if(a/i<=i)
			sum+=a/i;
		else
			sum+=i;
	}
	System.out.println(sum);
}
}
