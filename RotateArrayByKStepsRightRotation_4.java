// Optimal solutions : Reverse Method or “Array Reversal Algorithm
package Coding50Problems;

import java.util.Arrays;

public class RotateArrayByKStepsRightRotation_4 {

	public static void main(String[] args) {
//		{1,2,3,4,5,6,7} -> 7, 6, 5, 4, 3, 2, 1 -> 5,6,7,4,3,2,1 ->  5,6,7,1,2,3,4
//		{1,2,3,4,5,6,7} -> 3, 2, 1, 4, 5, 6, 7 -> 3,2,1,7,6,5,4 ->  4,5,6,7,1,2,3
		
		 int[] arr = {1,2,3,4,5,6,7}; 
		 if (arr == null || arr.length == 0) return;
	     int k = 3;
	     int n = arr.length-1;
	     k = k % arr.length;

//	     For right rotation
	     reverse(arr, 0, n);
	     reverse(arr, 0, k-1);
	     reverse(arr, k, n);
	     System.out.println(Arrays.toString(arr));
	     
//	     For left rotation	     
//	     	// Step 1: Reverse first k elements
//	        reverse(arr, 0, k - 1);
//	        // Step 2: Reverse remaining elements
//	        reverse(arr, k, arr.length - 1);
//	        // Step 3: Reverse the entire array
//	        reverse(arr, 0, arr.length - 1);
	}
	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
	}
}

// Complexity
//Time Complexity: O(n) → 3 passes over the array
//Space Complexity: O(1) → in-place, no extra array

// Naive Approach

//package Coding50Problems;
//
//import java.util.Arrays;
//
//public class RotateArrayByKStepsRightRotation_4 {
//
//	public static void main(String[] args) {
////		{1,2,3,4,5,6,7} -> 7, 6, 5, 4, 3, 2, 1 -> 5,6,7,4,3,2,1 ->  5,6,7,1,2,3,4
////		{1,2,3,4,5,6,7} -> 3, 2, 1, 4, 5, 6, 7 -> 3,2,1,7,6,5,4 ->  4,5,6,7,1,2,3
//		
//		 int[] arr = {1,2,3,4,5,6,7}; 
//		 if (arr == null || arr.length == 0) return;
//	     int k = 3;
//	     k = k % arr.length; // handle k > n
//	     for(int i = 0; i< k; i++) {
//	    	 int first = arr[0];
//	    	 for(int j = 0; j< arr.length-1; j++) {
//	    		 arr[j] = arr[j+1];
//	    	 }
//	    	 System.out.println(Arrays.toString(arr));
//	    	 arr[arr.length-1] = first;
//	     }
//	     System.out.println("Left rotated array (Naive): " + Arrays.toString(arr));
//	}
//}


//Time: O(n * k) → each shift moves n-1 elements, repeated k times
//Space: O(1) → only a single variable first is used


