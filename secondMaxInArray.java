package Arrays;

import java.util.Iterator;

public class secondMaxInArray {
	//Algo1 Solved
	public static int findSecondMaxAlgo1(int[] arr) {
		int maxVal = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == maxVal) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secondMaxVal = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > secondMaxVal) {
				secondMaxVal = arr[i];
			}
		}
		return secondMaxVal;
	}
	//Algo2 Not Solved
	public static int findSecondMaxAlgo2(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if(arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	
	//Algo2 Unsolved
	public static void main(String[] args) {
		int[] arr = {12, 34, 2, 34, 33, 1};
		System.out.println(findSecondMaxAlgo2(arr));

	}

}
