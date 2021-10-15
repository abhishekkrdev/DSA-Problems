public class BS {
  public static void main(String[] args){

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
