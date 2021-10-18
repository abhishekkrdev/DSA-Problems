// Below is an implementation of cyclic sort.
// No Duplicate Number are found.
// Time Complexity -> O(n)

import java.util.Arrays;

public class CycleSort {
  public static void main(String[] args){

    int[] arr = {1,3,2,5,4,6,7,9,8};
    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void cyclicSort(int[] arr){
      int i = 0;
      while(i<arr.length){
        int correctIndex = arr[i] - 1;
        if(arr[i]!=arr[correctIndex]){
          int temp = arr[i];
          arr[i] = arr[correctIndex];
          arr[correctIndex] = temp;
        }else{
          i++;
        }
      }
    
  }
}
