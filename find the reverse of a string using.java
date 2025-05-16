// find the reverse of a string using a stack
import java.util.Stack;
public class Stackprogram1{
  public static void main (String[] args) {
    
    String myString="Hello";
    Stack<Character> st=new Stack<Character>();
    String reverse="";
    
    for(int i=0;i<myString.length();i++){
      char ch=myString.charAt(i);
      st.push(ch);
    }
    
    for(int i=0;i<myString.length();i++){
      reverse=reverse+st.pop();
    }
    System.out.println(reverse);
  }
}