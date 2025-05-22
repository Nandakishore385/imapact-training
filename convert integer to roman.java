// convert integer to roman
public class Main {
    public static void main(String[] args) {
      int[] numbers = {
        1000,900,500,400,100,90,50,40,10,9,5,4,1
      };
      String[] symbols = {
        "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"
      };
      
      String result = " ";
      int num = 4995;
      for(int i=0;i<numbers.length && num>0;i++){
        while(num >= numbers[i]){
          num = num - numbers[i];
          result =  result + symbols[i];
        }
      }
      System.out.println(result);
  }
}