public class BS {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int s = 0;
    int e = arr.length - 1;
    search(arr, 5, s, e);
  }

  static int search(int[] arr,int target,int s,int e){
    if(s>e){
       return -1;
    }

    int mid = s + (e - s)/2;

    if(arr[mid]==target){
      return mid;
    }else if(arr[mid]> target){
      e = mid -1;
    } else {
      s = mid + 1;
    }
    return search(arr,target,s,e);
  }
  
}
