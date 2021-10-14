// Below Program is an implementation of  Binary Search Algorithm where the ordering is descending
// Edge case is [7,6,5,4,3,2,1] and we need to search 0, then at last start and end will point at index (length-1).
// and start will become greater than end which will break the loop

public class DescBS {
  public static void main(String[] args){
    int[] arr  = {7,6,5,4,3,2,1};
    int result = binarySearch(arr, 8);
    System.out.println(result);
    result = binarySearch(arr, 2);
    System.out.println(result);
  }

  private static int binarySearch(int[] nums,int target){
    int start = 0;
    int end = nums.length - 1;
    int result = -1;

    while (start<= end){
      int mid = start + (end-start)/2;

      if(target > nums[mid]){
        end = mid - 1;
      }else if(target<nums[mid]){
        start = mid + 1;
      }else{
        return mid;
      }
    }
    return result;
  }
}