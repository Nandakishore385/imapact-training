// Queue program
public class Main {
    public static void main(String[] args) {
      // 2 ways make a queue in java
      // using an Array 
      // using a linkedlist
      MyQueue mq = new MyQueue(10);
      mq.enqueue(12);
      mq.enqueue(13);
      mq.enqueue(14);
      mq.enqueue(17);
      mq.print();
      System.out.println("peek element is "+ mq.peek());
      System.out.println("--------------------");
      mq.dequeue();
      mq.print();
      System.out.println("peek element is "+ mq.peek());
  }
}

class MyQueue{
  int[] arr;
  int front,rear,size,capacity;
  
  MyQueue(int capacity){
    this.capacity = capacity;
    arr = new int[capacity];
    size = 0;
    front = 0;
    rear = -1;
  }
  void enqueue(int data){
    if(size==capacity){
      System.out.println("Queuen is full");
      return;
    }
    rear = (rear+1)% capacity;
    arr[rear] = data;
    size++;
  }
  void print(){
    int start=front;
    while(start<=size){
      System.out.println(arr[start]);
      start++;
    }
  }
  int dequeue(){
    if(size==0){
      System.out.println("Queue is empty");
      return -1;
    }
    int result = arr[front];
    front = (front + 1) % capacity;
    size--;
    return result;
  }
  int peek(){
    if(size==0){
      System.out.println("Queue is empty");
      return -1;
    }
    return arr[front];
  }
}