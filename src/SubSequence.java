
public class SubSequence {
	public static int maxSumIncreasingSubsequence(int[] nums,int i,int j,int sum) {
		
		// if i is the last num
		if(i==nums.length) {
			return sum;
		}
		//exclude the current element and process the remaining element
		int exclude = maxSumIncreasingSubsequence(nums,i+1,j,sum);
		//include the current element and process the remaining elements 
		int include = sum;
		if (nums[i] > j) {
			include = maxSumIncreasingSubsequence(nums,i+1,nums[i],sum+nums[i]);
		}
		
		//return the maximum 
		return Integer.max(exclude, include);
		
	}
	public static void main(String[] args) {
		int[] nums = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11};
		System.out.println("the maximum sum of increasing subsequence is "+maxSumIncreasingSubsequence(nums,0,Integer.MIN_VALUE,0));
	}

}
