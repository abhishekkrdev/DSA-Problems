// Find Unique Number in an array where all the number will in even quantity except for one number whose quantity will only be one.

// a ^ 0 = a
// a ^ a = 0
// a & 1 = a
// a ^ 1 = Complement(a)

public class UniqueNumber {
  public static void main(String[] args){
    int[] arr = {1,1,2,2,3,4,5,6,6,5,4};
    int result = findUnique(arr);
    System.out.println(result);
  }

  public static int findUnique(int[] arr){
    int unique = 0;

    for(int i = 0;i<arr.length;i++){
      unique = (unique^arr[i]);
    }
    return unique;
  }
  
}
