//find the factiorial of a number using recursive function
public class main{
  public static void main(String[]args){
    System.out.println(facto(5));
  }  
  static int facto(int a){
    if(a==0){
      return  1;
    }
    return a * facto(a-1);
    
  }
}