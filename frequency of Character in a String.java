//frequency of Character in a String
public class main {
    public static void main(String[] args) {
      String data = "programming";
      char ch = 'm';
      int counter=0;
      for(int i=0;i<data.length();i++){
        char element = data.charAt(i);
        if(ch==element){
          counter++;
        }
      }
      System.out.println(counter);
    }
}