package BaekJoon;

import java.util.Arrays;

public class _BaekJoon_9095_S3_123더하기 {

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4};
		int length = array.length;
		int[] output = new int[length];
		boolean[] isVisit = new boolean[length];
		
		for(int cnt=1; cnt<=length; cnt++) {
			permutation(array, output, isVisit, 0, length, cnt);
		}
		System.out.println();
	}
	
	public static void permutation(int[] array, int[] output, boolean[] isVisit, int depth, int length, int count) {
		if(count==0) {
			System.out.println(Arrays.toString(Arrays.stream(output).filter(i -> i!=0).toArray()));
			return;
		}
		for(int i=0; i<length; i++) {
			if(isVisit[i]!=true) {
				isVisit[i] = true;
				output[depth] = array[i];
				permutation(array, output, isVisit, depth+1, length, count-1);
				isVisit[i] = false;
			}
		}
	}
    

    public static void perm_recur_count(int[] input, boolean[] isOutput, int[] output, boolean[] isDepth, int depth, int count) {
		if(count==0) {
			for(int i=0, max=output.length; i<max; i++) {
				if(isOutput[i]) {
					System.out.print(output[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		
		for(int i=0, max=input.length; i<max; i++) {
			if(isDepth[i]!=true) {
				isDepth[i] = true;
				output[depth] = input[i];
				isOutput[depth] = true;
				
				perm_recur_count(input, isOutput, output, isDepth, depth+1, count-1);
				isDepth[i] = false;
				isOutput[depth] = false;
			}
		}
	}
    
}