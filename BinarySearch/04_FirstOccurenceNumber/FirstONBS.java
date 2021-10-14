// The below code find the first occurence of the number in sorted array.

public class FirstONBS {
  public static void main(String[] args){
    int[] arr= {1,2,3,4,4,4,5,6,6,8,8,9};
    int result = search(arr, 4);
    System.out.println(result);
  }

  public static int search(int[] arr,int target){
    int start = 0;
    int end = arr.length - 1 ;
    int answer = -1;

    while(start<=end){
      int mid = start + (end - start) /2;
      if(arr[mid]>target){
        end = mid - 1;
      }
      else if(arr[mid]<target){
        start = mid + 1;
      }else{
        answer = mid;
        // answer may be found or may be better answer will in laft array
        end = mid - 1;  
      }
    }
    return answer;

  }

  
}
