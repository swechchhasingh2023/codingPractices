// XOR

package Coding50Problems;

public class FindMissingNum_5 {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5}; // missing 3
        int n = 5;
        int xorFull = 0;
        int xorArr = 0;
     // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorFull ^= i;
        }
        
        for (int num : arr) {
            xorArr ^= num;
        }

        // Missing number = XOR of above two results
        int missing = xorFull ^ xorArr;
        
        System.out.println("Missing number is: " + (missing));
	}
}

// optimal 
//package Coding50Problems;
//
//public class FindMissingNum_5 {
//
//	public static void main(String[] args) {
//		int[] arr = {1,2,4,5}; // missing 3
//        int n = 5;
//        int expectedSum = n*(n+1)/2;
//        int actualSum = 0;
//        for(int num : arr) {
//        	actualSum += num;
//        }
//        System.out.println("Missing number: " + (expectedSum - actualSum));
//	}
//}

//Complexity: O(n), O(1)

//package Coding50Problems;
//
//public class FindMissingNum_5 {
//
//	public static void main(String[] args) {
//		int[] arr = {1,2,4,5}; // missing 3
//        int n = 5;
//        int expectedSum = 0;
//        for(int i = 0; i<=n;i++) {
//        	expectedSum += i;
//        }
//        int actualSum = 0;
//        for(int num : arr) {
//        	actualSum += num;
//        }
//        System.out.println("Missing number: " + (expectedSum - actualSum));
//	}
//}