public class inheritance{
  public static void main (String[] args) {
    Car C = new Car();
    C.company_name = "BMW";
    C.model = "S6";
    C.no_of_tyre = 4;
    C.driving();
    
    System.out.println(C.company_name);
    System.out.println(C.model);
    System.out.println(C.no_of_tyre);
  }
}

class vehicle{
  String model;
  int no_of_tyre;
  
  void driving(){
    System.out.println("vehicle is Driving");
  }
}
class Car extends vehicle{
  String company_name;
}