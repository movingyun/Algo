package SWEA;

import java.util.Scanner;

public class SWEA_2050_알파벳숫자 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	for(int i=0; i<a.length(); i++) {
		System.out.print((int)a.charAt(i)-64+" ");
	}
}
}
