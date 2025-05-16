import java.util.Stack;
public class stackprogram {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<Integer>();
    st.push(12);
    st.push(9);
    st.push(1);
    st.push(2);
    System.out.println(st);
    st.pop();
    System.out.println(st);
    st.pop();
    System.out.println(st);
    st.push(2);
    System.out.println(st);
    System.out.println(st.peek());
  }
  
}