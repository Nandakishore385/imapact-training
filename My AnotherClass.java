//My AnotherClass
import java.util.HashMap;
public class  MyAnotherClass {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);
    map.put("Four", 4);
    map.put("Three", 77);
    System.err.println(map);
  }
}