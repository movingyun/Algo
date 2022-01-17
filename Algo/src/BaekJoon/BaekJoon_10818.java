<<<<<<< HEAD
package BaekJoon;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.BYTE_ARRAY;

public class BaekJoon_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int[] arr = new int[n];
				
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);		
		System.out.println(arr[0] + " " + arr[n-1]);
	}
}
=======
package BaekJoon;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.BYTE_ARRAY;

public class BaekJoon_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int[] arr = new int[n];
				
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);		
		System.out.println(arr[0] + " " + arr[n-1]);
	}
}
>>>>>>> refs/remotes/origin/master
