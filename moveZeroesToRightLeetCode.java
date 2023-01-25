package Arrays;

public class moveZeroesToRightLeetCode {
	public static void moveZeroes(int[] nums) {
        int j = 0; //j storing 1st zero element from left
        for(int i = 0; i < nums.length; i++) { //i storing 1st non-zero element from left
            if(nums[i] != 0 && nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j] != 0) {
                j++;
            }
        }
    }
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		int[] arr = {8, 1, 0, 2, 1, 0, 3};
		printArray(arr);
		moveZeroes(arr);
		printArray(arr);
	}

}
