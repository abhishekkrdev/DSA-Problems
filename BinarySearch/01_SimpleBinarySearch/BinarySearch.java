// Below Program is an implementation of Classic Binary Search Algorithm
// Edge case is [1,2,3,4,5,6] and we need to search 0, then at last start and end will point at index 0
// and end will become -1 which will break the loop

public class BinarySearch {
  public static void main(String[] args){
    int[] arr  = {1,2,3,4,5,6,7};
    int result = binarySearch(arr, 8);
    System.out.println(result);
  }

  private static int binarySearch(int[] nums,int target){
    int start = 0;
    int end = nums.length - 1;
    int result = -1;

    while (start<= end){
      int mid = start + (end-start)/2;

      if(target >nums[mid]){
        start = mid + 1;
      }else if(target<nums[mid]){
        end = mid - 1;
      }else{
        return mid;
      }
    }
    return result;
  }
}