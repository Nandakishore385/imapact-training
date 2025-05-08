//binary search
public class May8 {
    public static void main(String[] args) {
      int arr[]={4,7,8,9,11,12,13,14,16,19,88};
      int e=19;
      int start=0;
      int end=arr.length-1;
      int flag=0;
      
      while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==e){
          flag=1;
          break;
        }
        if(e>arr[mid]){
          start=mid+1;
        }
        if(e<arr[mid]){
          end=mid-1;
        }
      }
      if(flag==1){
        System.out.println("Found");
      }else{
        System.out.println("NOt Found");
      }
  }
}