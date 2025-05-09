//String datatype
//Object datatype
public class Main {
    public static void main(String[] args) {
      String s1 = new String("parul");
      String s2 = "university";
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s1.length());
      System.out.println(s1.charAt(3));
      System.out.println(s1.substring(1,3));
      System.out.println(s1.compareTo(s2));
      System.out.println(s1.toUpperCase());
      System.out.println(s2.toUpperCase());
      System.out.println(s1.trim());
      System.out.println(s1.indexOf('u'));
      System.out.println(s1.replace('a','e'));
      System.out.println(s1.contains("ar"));
      
      String s3 = "programming";
      System.out.println(s3.lastIndexOf('m'));
      System.out.println(s3.startsWith("pro"));
      System.out.println(s3.endsWith("ing"));
    }
}