// StringBuffer
public class Main {
    public static void main(String[] args) {
      String str1 = "Hello";
      String str2 = "World";
      System.out.println(str1+" "+str2);
      
      StringBuffer sb = new StringBuffer("Hello");
      sb.append(" student");
      System.out.println(sb);
      
      StringBuffer sb1 = new StringBuffer("Elon Musk");
      sb1.insert(4,"Bhai");
      System.out.println(sb1);
      
      sb1.replace(0,2,"A");
      System.out.println(sb1);
      
      sb1.delete(0,2);
      System.out.println(sb1);
      
      sb1.reverse();
      System.out.println(sb1);
      System.out.println(sb1.length());
      System.out.println(sb1.charAt(3));
      
      sb1.reverse();
      System.out.println(sb1);
      
      sb1.setCharAt(4,'y');
      System.out.println(sb1);
      
      sb1.substring(6,10);
      System.out.println(sb1);
      
      String original = sb1.toString();
      
    }
}