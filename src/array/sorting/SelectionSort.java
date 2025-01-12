package array.sorting;

import java.util.Arrays;

class SelectionSort{
    public static void main(String[] args){
        int[] arr = {4,9,-9,0,-1,1,3,6,7};
        int size = arr.length;

        for(int i=0;i<size-1;i++){
            int minimum = i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[minimum]){
                    minimum = j;
                }
                    int temp = arr[i];
                    arr[i] = arr[minimum];
                    arr[minimum] = temp;
            }

        }

        System.out.println(Arrays.toString(arr));


    }
}

/*

Time Complexity
Best	                O(n2)
Worst	                O(n2)
Average	                O(n2)
Space Complexity	    O(1)
Stability	            No

Cycle	Number of Comparison
1st	    (n-1)
2nd 	(n-2)
3rd	    (n-3)
...	    ...
last	1

Number of comparisons: (n - 1) + (n - 2) + (n - 3) + ..... + 1 = n(n - 1) / 2 nearly equals to n2.
Complexity = O(n2)

Also, we can analyze the complexity by simply observing the number of loops. There are 2 loops so the complexity is n*n = n2.

Time Complexities:

Worst Case Complexity: O(n2)
-If we want to sort in ascending order and the array is in descending order then, the worst case occurs.

Best Case Complexity: O(n2)
-It occurs when the array is already sorted

Average Case Complexity: O(n2)
-It occurs when the elements of the array are in jumbled order (neither ascending nor descending).

The selection sort is used when

- a small list is to be sorted
- cost of swapping does not matter
- checking of all the elements is compulsory
- cost of writing to a memory matters like in flash memory (number of writes/swaps is O(n) as compared to O(n2) of bubble sort)
- Similar Sorting Algorithms

*/

