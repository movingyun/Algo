package SWEA;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 1; i <= T; i++) {
            String msg = sc.next();
            int index = 0;
            out : for (int j = 0; j < 10; j++) {
                if (msg.charAt(0) == msg.charAt(j)) {
                    if (msg.charAt(1) == msg.charAt(j + 1)) {
                        if (msg.charAt(2) == msg.charAt(j + 2)) {
                            index = j;
                            break out;
                        }
                    }
                }
            }
            System.out.printf("#%d %s\n", i, index);
        }
    }
}
