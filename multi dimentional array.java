// multi dimentional array
public class Main {
    public static void main(String[] args) {
      int[][] arr = {{1,2} , {3,4} , {5,6}};
      // 3 * 2 matrix
      System.out.println(arr[2][1]);
      
      for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
          System.out.println(arr[i][j]);
        }
      }
      
    }
}