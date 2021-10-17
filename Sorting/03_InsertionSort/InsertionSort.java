// Below is the implementation of the Insertion Sort(In Place Algorithm)
// We break the array into sub arrays of sorted array and non-sorted array
// It is a stable sorting algorithm.

/*
 Time Complexity -> Worst Case -> O(n^2)  Best Case -> O(n)
 Space Complexity -> O(1)
*/

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,10,2,3,4,5,6,7};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void insertionSort(int[] arr){
    for(int i = 0 ; i< arr.length-1; i++){ 
      for(int j = i+1; j> 0; j--){
        if(arr[j]<arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1]=temp;
        }else{
          // No Sense of comparison , as LHS would already be sorted.
          break;
        }
      } 
    }
  }
}
