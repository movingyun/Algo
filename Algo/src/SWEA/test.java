package SWEA;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] box = new int[301][301];
        int start=1;
        for(int i=1; i<300; i++) {
            int x=i;
            for(int j =1; j<=i; j++) 
                box[x--][j]=start++;
        }
        
        System.out.println(start);
    }
}
