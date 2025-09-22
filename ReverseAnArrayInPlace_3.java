// Optimal Approach
package Coding50Problems;

import java.util.Arrays;

public class ReverseAnArrayInPlace_3 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 8, 5};
		if(arr == null || arr.length ==0) {
			throw new IllegalArgumentException("Array is not valid");
		}
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}

}

// output [5, 8, 4, 3, 2, 1]
//Complexity: O(n), O(1)


// naive approach
//package Coding50Problems;
//import java.util.Arrays;
//
//public class ReverseAnArrayInPlace_3 {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 8, 5};
//
//        if (arr == null || arr.length == 0) {
//            throw new IllegalArgumentException("Array is not valid");
//        }
//
//        int n = arr.length;
//        int[] reversed = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            reversed[i] = arr[n - 1-i];
//        }
//
//        System.out.println("Original array: " + Arrays.toString(arr));
//        System.out.println("Reversed array: " + Arrays.toString(reversed));
//    }
//}

//🔹 Complexity
//Time Complexity: O(n) → each element copied once
//Space Complexity: O(n) → extra array used

