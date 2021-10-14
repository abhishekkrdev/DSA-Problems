// Below Program is an implementation of  Binary Search Algorithm where the ordering is not known


public class Oabinarysearch {
  public static void main(String[] args){
    int[] arr  = {7,6,5,4,3,2,1};
    boolean arrInAsc = isArraySortedInAsc(arr);
    int result = binarySearch(arr, 5, arrInAsc);
    System.out.println(result);
    int[] arr2 = {1,2,3,4,5,6};
    arrInAsc = isArraySortedInAsc(arr2);
    result = binarySearch(arr2, 3 , arrInAsc);
    System.out.println(result);
  }

  private static boolean isArraySortedInAsc(int[] arr){
    int start = 0;
    int end = arr.length-1;

    return !(arr[start]> arr[end]);
  }

  private static int binarySearch(int[] nums,int target,boolean arrInAsc){
    int start = 0;
    int end = nums.length - 1;
    int result = -1;

    while (start<= end){
      int mid = start + (end-start)/2;

      if(target > nums[mid]){
        if(arrInAsc){
          start = mid + 1;
        }else{
        end = mid - 1;
        }
      }else if(target<nums[mid]){
        if(arrInAsc){
          end = mid - 1;
        }else{
          start = mid + 1;
        }
      }else{
        return mid;
      }
    }
    return result;
  }
}