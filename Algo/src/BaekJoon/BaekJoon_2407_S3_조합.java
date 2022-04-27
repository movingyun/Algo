package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BaekJoon_2407_S3_조합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		BigInteger bigN=BigInteger.ONE;
		BigInteger bigM=BigInteger.ONE;
		for (int i = 0; i < m; i++) {
			bigN=bigN.multiply(new BigInteger(String.valueOf(n-i)));
			bigM=bigM.multiply(new BigInteger(String.valueOf(i+1)));
		}
		System.out.println(bigN.divide(bigM));
	}
}
