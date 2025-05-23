// check if the queue is palindrome or not  
import java.util.*;
public class NewClass2{
  public static void main (String[] args) {
    Queue<Integer> qu = new LinkedList<Integer>();
    qu.add(1);
    qu.add(2);
    qu.add(3);
    qu.add(4);
    qu.add(2);
    qu.add(1);
    int flag = 1;
    
    Stack<Integer> st = new Stack<Integer>();
    for(int a: qu){
      st.push(a);
    }
    System.out.println(st);
    for (int a : qu){
      if(a!=st.pop()){
        flag = 0;
        break;
      }
    }
    if(flag==1){
      System.out.println("palindrome");
    }
    else{
      System.out.println("Not palindrome");
    }
  }
}
