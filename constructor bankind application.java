public class constructor{
  public static void main (String[] args) {
    // create a class called bank
    // with 2 properties called
    // account no & balance deposite
    // create a method withdraw & deposite and make
    Bank b=new Bank(1234,10000);
    b.withdraw(5000);
    System.out.println(b.account_no+"\n"+b.balance);
    b.deposite(4000);
    System.out.println(b.account_no+"\n"+b.balance);
  }
}
class Bank{
  int account_no;
  double balance;
  
  Bank(int ac, double b){
    account_no=ac;
    balance=b;
  }
  
  void withdraw(double amount){
    balance=balance-amount;
  }
  void deposite(double amount){
    balance=balance+amount;
  }
}
