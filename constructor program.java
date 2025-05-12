// constructor
public class Main {
    public static void main(String[] args) {
      student s = new student(12,"kishore");
      // s.roll = 12;
      // s.name = "kishore";
      s.study();
      System.out.println(s.roll+" "+s.name);
      
      student s1 = new student(15,"Nanda");
      System.out.println(s1.roll+" "+s1.name);
  }
}
class student{
  int roll;
  String name;
  void study(){
    System.out.println("student is studing");
  }
  student(int r, String n){
    roll = r;
    name = n;
  }
}
