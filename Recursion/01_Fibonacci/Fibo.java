public class Fibo {
  public static void main(String[] args){
    System.out.println(fibo(10));
  }

  public static int fibo(int n){
    // Base Condition
    if(n ==0 || n==1){
      return n;
    }
    return fibo(n-1)+fibo(n-2);
  }
}
