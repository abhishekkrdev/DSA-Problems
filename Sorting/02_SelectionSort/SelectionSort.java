// Below is the implementation of the Selection Sort(In Place Algorithm)
// It is not stable
// for eg. [4 5 3 2 4 1] ,if we replace 1 with 4(first element of array) then relative position will change
// performs well on small lists

/*
 Time Complexity -> O(n^2)
 Space Complexity -> O(1)
*/

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,10,2,3,4,5,6,7};
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void selectionSort(int[] arr){
    for(int i = 0 ; i< arr.length-1; i++){
      int min = i;
      
      for(int j = i+1; j< arr.length; j++){
        if(arr[j]<arr[i]){
          min = j;
        }
      }

      if(min!=i){
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
      }
    }
  }
}
