// inheriance with constructor
public class main{
  public static void main(String[] args){
    keyboard kb = new keyboard();
    System.out.println(kb.price);
    System.out.println(kb.width);
    
  }
}
class component{
  double price;
  double width;
  component(double price,double width){
    this.price = price;
    this.width = width;
  }
}
class keyboard extends component{
  keyboard(){
    super(1200,34.56);
  }
  
}