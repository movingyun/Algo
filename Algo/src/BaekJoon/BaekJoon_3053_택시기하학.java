package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_3053_택시기하학 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	float a = Integer.parseInt(br.readLine());
	System.out.printf("%.6f",Math.pow(a, 2)*Math.PI);
	System.out.println();
	System.out.printf("%.6f",Math.pow(a, 2)*2);
}
}
