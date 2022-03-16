package Programmers;

public class _Programmers_lv1_소수만들기 {
	static int cnt;
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		solution(nums);
		System.out.println(cnt);
	}

	public static int solution(int[] nums) {
		cnt = 0;
		for(int i=0; i<nums.length; i++) {
			int sum = 0;
			for(int j=i+1; j<nums.length; j++) {
				for(int k=j+1; k<nums.length; k++) {
					sum=nums[i]+nums[j]+nums[k];
					if(isSel(sum))
						cnt++;
				}
			}
		}
		
		return cnt;
	}

	public static boolean isSel(int sum) {
		int flag = 1;
		for (int i = 2; i < Math.sqrt(sum) + 1; i++) {
			if (sum % i == 0) {
				flag = 0;
				break;
			}
		}
		if (flag == 1)
			return true;
		else
			return false;
	}
}
