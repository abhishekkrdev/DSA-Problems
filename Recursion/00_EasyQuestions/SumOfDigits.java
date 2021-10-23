public class SumOfDigits {
  public static void main(String[] args){
    int result = sumDigit(51);
    System.out.println(result);
  }

  public static int sumDigit(int n){
    if(n<=0){
      return 0;
    }
    int digit = n % 10;
    return digit+sumDigit(n/10);
  }
  
}
