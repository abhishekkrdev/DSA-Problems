public class Sum {
  public static void main(String[] args){
    int result = sum(5);
    System.out.println(result);
  }

  public static int sum(int n){
    if(n<=1){
      return 1;
    }
    return n+ sum(n-1);
  }
  
}
