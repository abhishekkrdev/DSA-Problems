// The below code returns first and last occurence of a sorted array.
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;



class FistLastEleBS {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,6,6,6,6,8,8,9,10,10,11};
    int[] rangeResult = searchRange(arr,6);
    System.out.println(Arrays.toString(rangeResult));

  }
  public static int[] searchRange(int[] nums, int target) {
      int start = 0;
      int end = nums.length - 1;
      int[] ans = {-1,-1};
      
      ans[0] = search(nums,start,end,target,true);
      if(ans[0]!=-1){
          ans[1] = search(nums,start,end,target,false);
      }
      return ans; 
  }
  
  public static int search(int[] nums,int start,int end,int target,boolean searchStart){
        int ans = -1;  
        while(start<=end){
          int mid = start + (end - start) / 2;
          if(target < nums[mid]){
              end = mid - 1;
          }else if(target > nums[mid]){
              start = mid + 1;
          }else{
              ans = mid;
              if(searchStart){
                  end = mid - 1;
              }else{
                  start = mid + 1;
              }
          }
      }
      return ans;
      
  }
}