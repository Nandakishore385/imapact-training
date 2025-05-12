//polymorphism
public class main{
  public static void main(String[] args){
    // function overloding
    // function overriding
    
    
    // function overloading
    meraClass mc = new meraClass();
    mc.myFunc(12,"20");
    
    // function overriding
    B b = new B();
    b.jump();
    
  }
}

class A {
  void jump(){
    System.out.println("jumping 1");
  }
}
class B extends A{
  void jump(){
    System.out.println("jumping 2");
  }
}

class meraClass{
  void myFunc(String b, int a){
    System.out.println("Function Calling 1");
    }
    void myFunc(int a, String b){
      System.out.println("function calling 2");
    }
}
