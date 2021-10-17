// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class MissingNumberAll {
  public static void main(String[] args){
    int[] arr = {1,1};
    List<Integer> result = disappeared(arr);
    System.out.println(result);
  }

  private static  List<Integer> disappeared(int[] arr){
    List<Integer> result = new ArrayList<>();
    int i = 0;

    while(i<arr.length){
        int correctIndex = arr[i] - 1;
        if(arr[i] - arr[correctIndex] != 0){
            int temp = arr[i];
            arr[i] = arr[correctIndex];
            arr[correctIndex] = temp;
        }else{
            i++;
        }
    }
          
    for(int j = 0;j<arr.length;j++){
        if(arr[j] != j+1){
          result.add(j+1);
        }
    }
  
    return result;
  }
  
}
