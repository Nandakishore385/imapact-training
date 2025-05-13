// MyCollectionFramework
import java.util.ArrayList;
public class MyollectionFramework {
  public static void main(String[] args) {
    
    ArrayList<Integer> arr=new ArrayList<Integer>();
    arr.add(12);
    arr.add(13);
    arr.add(14);
    arr.add(15);
    System.out.println(arr);
    for(Integer i:arr){
      System.err.println(i);
    }
    arr.add(100);
    arr.add(50);
    System.err.println(arr);
    
    arr.add(2 , 77);
    System.out.println(arr);
    
    System.out.println(arr.get(5));
    
    arr.remove(2);
    
    System.out.println(arr);
    
    ArrayList<Integer> arr2 = new ArrayList<>();
    arr2.add(11);
    arr2.add(12);
    arr2.add(13);
    arr2.add (14);
    
    arr.addAll(arr2);
    System.out.println(arr2);
  }
}