// Find whether a number is odd or even without using modulo operator

// a ^ 0 = a
// a ^ a = 0
// a & 1 = a
// a ^ 1 = Complement(a)

public class OddEven {
  public static void main(String[] args){
    int num1 = 11;
    int num2 = 8;

    boolean result1 = isOdd(num1);
    System.out.println(result1);

    boolean result2 = isOdd(num2);
    System.out.println(result2);
   
  }

  public static boolean isOdd(int num){
    // Doing a bitwise AND with 1 will give itself.
    if((num&1) == 1){
      return true;
    }else{
      return false;
    }
  }
}
