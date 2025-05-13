// Try and Catch Exceptions
public class Main {
    public static void main(String[] args) {
      System.out.println("Start of program");
      
      try{
        System.out.println(10/0);
        
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[5]);
      }catch(ArithmeticException e){
        System.out.println("can not divide with zero");
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index out of Bound");
      }
      
      System.out.println("End of program");
    }
}