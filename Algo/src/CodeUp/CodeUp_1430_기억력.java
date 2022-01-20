package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;
public class CodeUp_1430_기억력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[10000001];
        
        int N = sc.nextInt();
        for(int i = 0; i < N; i++)
            arr[sc.nextInt()] = true;
        
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++)
            sb.append(arr[sc.nextInt()]?1:0).append(" ");
        System.out.println(sb);
    }
}
