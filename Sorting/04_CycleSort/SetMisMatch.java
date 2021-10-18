// https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;

public class SetMisMatch {
  public static void main(String[] args){
    int[] arr = {1,2,2,4};
    int[] result = setMisMatch(arr);
    System.out.println(Arrays.toString(result));
  }

  private static int[] setMisMatch(int[] arr){
        int i = 0 ;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            
            if(arr[correctIndex]!=arr[i]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        
        int[] result = {-1,-1};
        
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                result[0] = arr[i];
                result[1] = i+1;
            }
        }
        return result;
  } 
}
