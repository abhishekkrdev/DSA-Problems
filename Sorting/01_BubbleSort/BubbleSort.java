// Below is the implementation of the Bubble Sort(In place sorting algorithm)
// Also Known as Sinking Sort or Excahnge Sort.
// It is a stable sorting algorithm. Order remains same if values remains same
// Relative ordering doesn't change.

/* Time Complexity -> Best Case -> O(n)  ( If the array is already sorted)
                  -> Worst Case -> O(n^2) 

  Space Complexity -> O(1)
*/

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args){
    int[] arr = {7,6,5,4};

    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void bubbleSort(int[] arr){
    for(int i = 0; i < arr.length-1; i++){
      
      // With Every Run of loop largest element will be shifted to last
      boolean isSorted = true;
      for(int j = 0 ; j < (arr.length-1-i) ; j++){
        // Each time j< arr.length - 1
        if(arr[j]>arr[j+1]){
          isSorted = false;
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
      // To Check if the array is already sorted,if it is then end the program
      // Optimization is Done.
      if(isSorted){
        break;
      }
    }
  }
  
}
