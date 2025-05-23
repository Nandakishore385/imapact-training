// Queue program 2
import java.util.*;
public class NewClass2{
  public static void main (String[] args) {
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(12);
    queue.add(15);
    queue.add(13);
    queue.add(17);
    System.out.println(queue);
    
    queue.remove();
    
    System.out.println(queue);
    System.out.println(queue.peek());
  }
}
