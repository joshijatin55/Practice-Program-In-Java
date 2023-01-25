package Arrays;

public class findMissingNumberLeetCode {
	public static int missingNumber(int[] nums) {
	       int n = nums.length + 1;
	       int sumOfFirstN = (n * (n + 1)) / 2;
	       for(int i = 0; i < nums.length; i++) {
	           sumOfFirstN -= nums[i];
	       }
	       return sumOfFirstN;
	    }
	public static void main(String[] args) {
		//Size of array is 7 but range is from 1 to 8
		int[] arr = {1, 3, 6, 8, 2, 4, 7};
		System.out.println("Missing number is " + missingNumber(arr));
	}

}
