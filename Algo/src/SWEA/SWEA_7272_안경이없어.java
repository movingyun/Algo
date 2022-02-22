package SWEA;

import java.util.Scanner;
//22.02.22
//replace함수 활용 char 변경
public class SWEA_7272_안경이없어 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char[] arr_0 = { 'C', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
				'Z' };
		char[] arr_1 = { 'A', 'D', 'O', 'P', 'Q', 'R' };
		char[] arr_2 = { 'B' };
		for (int tc = 1; tc <= T; tc++) {
			String a = sc.next();
			String b = sc.next();
			String result = "DIFF";
			for (int i = 0; i < arr_0.length; i++) {
				a = a.replace(arr_0[i], 'a');
				b = b.replace(arr_0[i], 'a');
			}
			for (int i = 0; i < arr_1.length; i++) {
				a = a.replace(arr_1[i], 'b');
				b = b.replace(arr_1[i], 'b');
			}
			for (int i = 0; i < arr_2.length; i++) {
				a = a.replace(arr_2[i], 'c');
				b = b.replace(arr_2[i], 'c');
			}

			if (a.length() == b.length()) {
				if (a.equals(b))
					result = "SAME";
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}


//replaceAll 활용하기!!!

//import java.util.Scanner;
//
//class Solution
//{
//    public static void main(String args[]) throws Exception
//    {
//        Scanner sc = new Scanner(System.in);
//         
//        int T = sc.nextInt();
//        for(int t = 1 ; t <= T ; t++) {
//            String ans = "DIFF";
//            String[] lines = new String[2];
//            for(int i = 0 ; i < 2 ; i++) {
//                lines[i] = sc.next();
//                lines[i] = lines[i].replaceAll("[CEFGHIJKLMNSTUVWXYZ]", "0");
//                lines[i] = lines[i].replaceAll("[ADOPQR]", "1");
//            }
//            if(lines[0].equals(lines[1])) ans = "SAME";
//            System.out.printf("#%d %s%n", t, ans);
//        }
//    }
//}