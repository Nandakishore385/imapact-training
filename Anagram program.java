import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      String s1 = "silent";
      String s2 = "listen";
      
      char arr1[] = s1.toCharArray();
      System.out.println(Arrays.toString(arr1));
      
      char arr2[] = s2.toCharArray();
      System.out.println(Arrays.toString(arr2));
      
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      System.out.println(Arrays.toString(arr1));
      System.out.println(Arrays.toString(arr2));
      
      String news1 = new String(arr1);
      String news2 = new String(arr2);
      
      if(news1.equals(news2)){
        System.out.println("Anagram");
        }
        else{
          System.out.println("Not Anagram");
        }
    }
}