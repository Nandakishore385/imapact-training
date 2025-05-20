ublic class LinkList {
    public static void main(String[] args) {
      myLinkList ml = new myLinkList();
      ml.add(12);
      ml.add(13);
      ml.add(14);
      ml.add(15);
      ml.add(16);
      ml.printKaro();
      ml.removeLastElement();
      
      
      
    }
}
class myLinkList{
  Node head;
  void add(int xyz){
    if(head==null){
      head = new Node(xyz);
      return;
    }
    Node temp = head;
    while(temp.next!=null){
      temp = temp.next;
    }
    temp.next = new Node(xyz);
  }
  void printKaro(){
    if(head==null){
      System.out.println("No Element Found");
      return;
    }
    Node temp = head;
    while(temp.next!=null){
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println(temp.data);
  }
  void removeLastElement(){
    if(head==null){
      System.out.println("No Element to be Remove");
      return;
    }
    if(head.next==null){
      head=null;
      return;
    }
    Node temp = head;
    while(temp.next.next!=null){
      temp = temp.next;
    }
    temp.next = null;
    
  }
  
}
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}