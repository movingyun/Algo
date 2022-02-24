package SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class SWEA_1225_암호생성기3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
 
        /*
 
        for(int t = 0; t< 10; t++){
            Queue<Integer> q = new LinkedList<>();
            int tc = sc.nextInt();
            for(int i = 0; i < 8; i++)
                q.add(sc.nextInt());
            int count = 1;
            while(q.peek() > count){
                q.add(q.remove() - count);
                if(count == 5)
                    count = 0;
                count++;
            }
            q.remove();
            q.add(0);
 
            sb.append("#").append(tc).append(" ");
 
            for(int i = 0; i < 8; i++)
                sb.append(q.remove()).append(" ");
 
            sb.append("\n");
        }
 
        System.out.println(sb);
        */
 
        //modulo
        for(int t = 0; t < 10; t++){
            int tc = sc.nextInt();
            sb.append("#").append(tc).append(" ");
            int[] arr = new int[8];
            for(int i = 0; i < 8; i++)
                arr[i] = sc.nextInt();
            int count = 1;
            int idx = 0;
            while(true){
                 arr[idx % 8] -= count++;
                 if(arr[idx % 8] <= 0) {
                     arr[idx % 8] = 0;
                     break;
                 }
                 if(count == 6)
                     count = 1;
                 idx++;
            }
 
            for(int i = 0; i < 8; i++){
                sb.append(arr[(idx + 1 + i) % 8]).append(" ");
            }
            sb.append("\n");
 
 
        }
        System.out.println(sb);
 
 
    }
}