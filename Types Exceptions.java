//  types Exceptions
public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int[] arr = {1,2,3,4,5};
      System.out.println(arr[10]);
      //Array indexout bounds Exceptions
      
      String data = "hello";
      System.out.println(data.charAt(10));
      //String indexout bounds Exceptions
      
      System.out.println(12/0);
      //ArithmeticException
      
      String name = null;
      System.out.println(name.length());
      //NullPointerException
  }
}