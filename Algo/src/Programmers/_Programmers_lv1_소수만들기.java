package Programmers;

public class _Programmers_lv1_소수만들기 {
	static int sum =0;
	static int cnt = 0;
	static int[] nums;
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};	
		solution(nums);
		System.out.println(cnt);
	}

	public static int solution(int[] nums) {
		recur(0,0);
		return cnt;
	}
	
	public static void recur(int dep, int sum) {
		//끝내
		if(dep==3) {
//			int flag = 1;
//			for(int i=2; i<Math.sqrt(sum)+1; i++) {
//				if(sum%i==0) {
//					flag=0;
//					break;
//				}
//			}
//			if(flag==1)
//				cnt++;
			System.out.println(sum);
			return;
		}
		System.out.println("여기");
		//함수
		recur(dep+1, sum+nums[dep]);
		recur(dep+1, sum);
		
		
		
		
		
		
		
	}
}
