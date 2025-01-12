package array.sorting;

import java.util.Arrays;

class BubbleSort{
    public static void main(String[] args){

//        Declare an array and initialize values
        int[] arr = {8,-9,7,3,5,-2,0,4,-1};

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){

                //  Swap value if first values is greater than second values
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr)); // Convert Array to String and print
    }
}

/*
Time Complexity
Best	                O(n)
Worst	                O(n2)
Average	                O(n2)
Space Complexity	    O(1)
Stability	            Yes


Cycle	Number of Comparisons
1st 	(n-1)
2nd 	(n-2)
3rd 	(n-3)
.......	......
last	1


1. Time Complexities

Worst Case Complexity: O(n2)
- If we want to sort in ascending order and the array is in descending order then the worst case occurs.

Best Case Complexity: O(n)
- If the array is already sorted, then there is no need for sorting.

Average Case Complexity: O(n2)
- It occurs when the elements of the array are in jumbled order (neither ascending nor descending).

2. Space Complexity

- Space complexity is O(1) because an extra variable is used for swapping.
- In the optimized bubble sort algorithm, two extra variables are used. Hence, the space complexity will be O(2).

*/
