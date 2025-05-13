// StringPractice
 public class Practice {
   public static void main(String[] args) {
     Student s = new Student();
     s.st_name = "kishore";
     s.st_address = "vadodara";
     s.clg = new collage();
     s.clg.col_name = "parul University";
     
     System.out.println(s.st_name + " " + s.st_address + " " + s.clg.col_name);

     
   }
 }
 class collage {
   String col_name;
 }
 class Student{
   String st_name;
   String st_address;
   collage clg;
 }