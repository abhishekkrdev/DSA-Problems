public class FloorBS {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,7,9,11,13,15};

    int result = findFloor(arr,14);
    System.out.println(arr[result]);
  }

  private static int findFloor(int[] arr,int target){
    int start = 0 ;
    int end = arr.length - 1;

    while(start<=end){
      int mid = start + (end - start)/2;

      if(arr[mid]> target){
        end = mid - 1;
      }else if (arr[mid]<target){
        start = mid + 1;
      }else{
        return mid;
      }
    }
    return end;
  }
  
}
