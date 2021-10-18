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
    
      if(arr[i]!=i+1 ) {
        int correctIndex = arr[i] - 1;
        if(arr[correctIndex]!= arr[i]){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex]=temp;
        }else{
          return arr[i];
        }
      }else{
        i++;
      }
    }
       return result;
  }
  
}
