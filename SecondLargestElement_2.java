package Coding50Problems;

// optimal solution
public class SecondLargestElement_2 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 5, 63, 98, 8, 30};
		System.out.println(findSecondLargest(arr));

	}
	public static int findSecondLargest(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array must have at least two elements");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int element : arr) {
			if(element > largest) {
				secondLargest = largest;
				largest = element;
			} else if(element > secondLargest && element != largest) {
				secondLargest = element;
			}
		}
		
		 if (secondLargest == Integer.MIN_VALUE) {
	            throw new RuntimeException("No second largest element found");
	        }
		
		return secondLargest;
	}
}

//Time & Space Complexity
//Time: O(n) → single pass.
//Space: O(1).


//package Coding50Problems;
//
//import java.util.Arrays;
//
//// naive solution
//public class SecondLargestElement {
//
//	public static void main(String[] args) {
//		int[] arr = {10, 20, 5, 63, 52,98, 98, 8, 30};
//		System.out.println(findSecondLargest(arr));
//
//	}
//	public static int findSecondLargest(int[] arr) {
//		if(arr == null || arr.length == 0) {
//			throw new IllegalArgumentException("Array must have at least two elements");
//		}
//		Arrays.sort(arr);
//		int largest = arr[arr.length-1];
//		for(int i = arr.length-2; i >=0 ; i--) {
//			if (arr[i] < largest) {
//	            return arr[i];
//	        }
//		}
//		
//		throw new RuntimeException("No second largest element found");
//	}
//}

//Naively, I can sort the array and check the element before the maximum → O(n log n).
//But sorting is overkill. The optimal way is O(n) in one pass, keeping 
//track of the largest and second largest values.
