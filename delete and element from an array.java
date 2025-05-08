// delete and element from an array
import java.util.Arrays;
public class delete {
    public static void main(String[] args) {
      int arr[] = {12,14,15,78,6745,78,9,5};
      int index = 4;
      int count = 0;
      int newarr[] = new int[arr.length-1];
      for(int i=0;i<arr.length;i++){
        if(i!=index){
          newarr[count] = arr[i];
          count++;
          
        }
      }
      System.out.println(Arrays.toString(newarr));
    }
}