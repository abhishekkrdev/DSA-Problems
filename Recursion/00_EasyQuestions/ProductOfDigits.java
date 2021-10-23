public class ProductOfDigits {
  public static void main(String[] args){
    int result = productDigit(501);
    System.out.println(result);
  }

  public static int productDigit(int n){
    if(n%10==n){
      return n;
    }
    int digit = n % 10;
    return digit*productDigit(n/10);
  }
  
}
