// //OOPS CLASS 
public class Main {
    public static void main(String[] args) {
      student s1 = new student();
      s1.roll = 1234;
      s1.name = "kishore";
      s1.height = 6.5f;
      s1.weight = 44.45;
      s1.age = 21;
      s1.study();
      System.out.println(s1.roll);
      System.out.println(s1.name);
      System.out.println(s1.height);
      System.out.println(s1.weight);
    
      
      student s2 = new student();
      s2.roll = 5698;
      s2.name = "kishore";
      s2.height = 5.7f;
      s2.weight = 52.66;
      s2.study();
      System.out.println(s2.roll);
      System.out.println(s2.name);
      System.out.println(s2.height);
      System.out.println(s2.weight);
      
      
  }
}
class student{
  int roll;
  String name;
  float height;
  double weight;
  int age;
  void study(){
    System.out.println("student is stuing");
  }
}