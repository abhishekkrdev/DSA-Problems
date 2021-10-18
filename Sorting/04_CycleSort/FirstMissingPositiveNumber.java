// https://leetcode.com/problems/first-missing-positive/
// Ignore Negative And Numbers Greater than length of the array

public class FirstMissingPositiveNumber {
  public static void main(String[] args){
    int[] arr = {7,8,9,11,12};
    int result = firstMissingPositiveNumber(arr);
    System.out.println(result);
  }

  private static int firstMissingPositiveNumber(int[] arr){
       int i = 0 ;
        
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i]> 0 && arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        
        for(i = 0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
  }
  
}
