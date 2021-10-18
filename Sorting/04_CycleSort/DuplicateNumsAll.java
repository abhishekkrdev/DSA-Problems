import java.util.ArrayList;
import java.util.List;

public class DuplicateNumsAll {
  public static void main(String[] args){
    int[] arr = {4,3,2,7,8,2,3,1};
    List<Integer> result =findAllDuplicates(arr);
    System.out.println(result);

  }

  private static List<Integer> findAllDuplicates(int[] arr){
    int i = 0;
    while(i<arr.length){
      int correctIndex = arr[i] - 1 ;
      if(arr[i]!= arr[correctIndex] ){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
      }else{
        i++;
      }
    }

    List<Integer> ans = new ArrayList<>();

    for(int index = 0;index<arr.length;index++){
      if(arr[index]!=index+1){
        ans.add(arr[index]);
      }
    }
    return ans;
    
  }
}
