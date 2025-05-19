// check if  the current string is a subsequence of parent string to not
public class Main {
    public static void main(String[] args) {
      System.out.println (CheckSubSequence("abdac","abc"));
  }
  static Boolean CheckSubSequence(String parent, String f){
    int i=0;
    int j=0;
    while(i < parent.length() && j < f.length()){
      if(parent.charAt(i) == f.charAt(j)){
        System.out.println(i + " " +  j);
      
        j++;
        
      }
       i++;
    }
    return j==f.length();
    
  }
  
}