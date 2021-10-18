// https://leetcode.com/problems/missing-number/

public class MissingNumber {
  public static void main(String[] args){
    int[] arr = {0,2,1};
    int result = missingNumber(arr);
    System.out.println(result);
  }

  private static int missingNumber(int[] arr){
    int i = 0;
    while(i<arr.length){
      int correctIndex = arr[i];
      if(arr[i]<arr.length && arr[i]!= arr[correctIndex] ){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
      }else{
        i++;
      }
    }
    for(int j=0;j<arr.length;j++){
      if(arr[j]!=j){
        return j;
      }
    }
   return arr.length;

  }
  
}
