// https://leetcode.com/problems/find-the-duplicate-number/

public class DuplicateNumber {
  public static void main(String[] args){
    int[] arr = {1,2,2};
    int result = duplicateNumber(arr);
    System.out.println(result);
  }

  private static int duplicateNumber(int[] arr){
    int i = 0;
    int result = -1;
    while(i<arr.length){
      int correctIndex = arr[i] - 1;
      if(arr[i]!=arr[correctIndex] ) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex]=temp;
      }else{
        i++;
      }
    }
    for(int j=0;j<arr.length;j++){
      if(arr[j]!=j){
        result = arr[j];
      }
    }
   return result;

  }
  
}
