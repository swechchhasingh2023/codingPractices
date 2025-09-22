package Coding50Problems;

public class LargestElement_1 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 5, 98, 8, 30};
		System.out.println(findLargest(arr));
	}
	public static int findLargest(int[] arr) {
		if(arr == null || arr.length ==0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int max = arr[0];
		for(int element :arr) {
			if (element > max) {
	            max = element;
	        }
		}
		 return max;
	}
}

//TP:
//	Time Complexity: O(n) (you scan each element once).
//
//	Space Complexity: O(1) (no extra space used).

//
//✅ Naive Approach (Sorting)
//
//import java.util.Arrays;
//
//public class LargestElementNaive {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 5, 98, 8, 30};
//        if (arr.length == 0) {
//            System.out.println("Array is empty");
//            return;
//        }
//        // Sort the array
//        Arrays.sort(arr);
//        // Last element will be the largest
//        System.out.println("Largest element (Naive): " + arr[arr.length - 1]);
//    }
//}
//Time Complexity: O(n log n)
//Space Complexity: O(1) (ignoring sort’s internal space)

//Naively, I can sort the array in O(n log n) and take the last element.
//But sorting is unnecessary overhead, so the optimal solution is just a 
//single pass, O(n), keeping track of the maximum.
