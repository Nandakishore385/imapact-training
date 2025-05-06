// find the max  and min element from an Arrays   
//Compare   
class main{
  public static void main(String[] args){
    int[] arr = {2,435,67,789,65,34,65555,87,353,3};
    int max = arr[0];
    int min = arr[0];
    
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
      if(arr[i]<min){
        min = arr[i];
      }
    }
    System.out.println(max);
    System.out.println(min);
  }
}