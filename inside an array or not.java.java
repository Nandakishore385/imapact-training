// check if the element is inside an array or not   
class main{
  public static void main(String[] args){
    int arr[] = {1,2,3,6,8,6,43,2,3};
    int ele = 3;
    int flag = 0;
    
  for(int i=0;i<arr.length;i++){
    if(arr[i]==ele){
      flag=1;
      break;
    }
  }
  if(flag==1){
    System.out.println("found");
  }else{
    System.out.println(" not found");
  }
  }