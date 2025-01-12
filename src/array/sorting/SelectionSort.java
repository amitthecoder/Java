package array.sorting;

class SelectionSort{
    public static void main(String[] args){
        int[] arr = {4,9,-9,0,-1,1,3,6,7};
        int size = arr.length;

        for(int i=0;i<size-1;i++){
            int minimum = arr[i];
            for(int j=i+1;j<size-1;j++){
                if(arr[j]<arr[minimum]){

                }
            }

        }


    }
}


//selectionSort(array, size)
//  for i from 0 to size - 1 do
//    set i as the index of the current minimum
//    for j from i + 1 to size - 1 do
//        if array[j] < array[current minimum]
    set j as the new current minimum index
        if current minimum is not i
            swap array[i] with array[current minimum]
end selectionSort


/*

Time Complexity
Best	                O(n2)
Worst	                O(n2)
Average	                O(n2)
Space Complexity	    O(1)
Stability	            No

*/

