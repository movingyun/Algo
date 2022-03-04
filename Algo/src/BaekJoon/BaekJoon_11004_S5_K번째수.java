package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//22.03.03
//카운팅 정렬로 풀어보자 -> 최대값이 너무 크다..
//걍 array sort하면 풀린다....
public class BaekJoon_11004_S5_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> arr = new ArrayList<Integer>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        System.out.println(arr.get(k-1));
    }
}