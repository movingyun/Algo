package SWEA;

import java.util.Scanner;

public class SWEA_2047_신문헤드라인 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String a = sc.next();
	for(int i=0; i<a.length(); i++) {
		if((int)a.charAt(i)>=97 && (int)a.charAt(i)<=122)
			System.out.print((char)((int)a.charAt(i)-32));
		else
			System.out.print(a.charAt(i));
	}
}
}
